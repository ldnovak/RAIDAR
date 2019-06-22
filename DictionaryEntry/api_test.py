import requests
import pytest
import os
import ast

port = '8102'
route = 'EntryDB'
address = os.path.join('http://localhost:'+port, route)
username = 'Test'
password = 'Root'


def test_connect():
    assert requests.get(address).status_code == 200


def test_add_data():
    key_name = 'Alice'
    value_list = ["Yo", "Mom"]
    # Test add
    response = requests.post(os.path.join(address, 'create'), json={'key': key_name, 'valueList': value_list})
    assert response.status_code == 200
    assert response.json()['key'] == key_name
    assert response.json()['valueList'] == value_list
    id = response.json()['id']
    # test get by id
    get_id_response = requests.get(os.path.join(address, 'getId/'+id))
    assert get_id_response.status_code == 200
    # test get by key
    get_key_response = requests.get(os.path.join(address, 'getKey/'+key_name))
    assert get_key_response.status_code == 200
    value_list_found = False
    for dictionary_entry in ast.literal_eval(get_key_response.text):  # turns response into list of dictionaries
        if dictionary_entry == response.json():
            value_list_found = True
            break
    assert value_list_found
    # test delete
    delete_response = requests.delete(os.path.join(address, id))
    assert delete_response.status_code == 200
    assert requests.get(os.path.join(address, 'getId/'+id)).text == ''


def test_modify_data():
    key_name1 = 'Bob'
    value_list1 = []
    key_name2 = 'Carol'
    value_list2 = ["This", "is", "wild"]
    # test add
    response1 = requests.post(os.path.join(address, 'create'), json={'key': key_name1, 'valueList': value_list1})
    assert response1.status_code == 200
    assert response1.json()['key'] == key_name1
    assert response1.json()['valueList'] == value_list1
    id1 = response1.json()['id']
    # test add with at least 1 other element
    response2 = requests.post(os.path.join(address, 'create'), json={'key': key_name2, 'valueList': value_list2})
    assert response2.status_code == 200
    assert response2.json()['key'] == key_name2
    assert response2.json()['valueList'] == value_list2
    id2 = response2.json()['id']
    # test modify value list by adding 1 move value
    value_to_add = 'Nice'
    add_1_response = requests.put(os.path.join(address, 'add/' + id1 + '/' + value_to_add))
    assert add_1_response.status_code == 200
    assert add_1_response.json() == {'id': id1, 'key': key_name1, 'valueList': [value_to_add]}
    # test modify list by adding list
    add_list = ['my', 'guy']
    add_list_response = requests.put(os.path.join(address, 'add/'+id2), json={'key': key_name2, 'valueList': add_list})
    assert add_list_response.status_code == 200
    assert add_list_response.json() == {'id': id2, 'key': key_name2, 'valueList': value_list2+add_list}
    # test modify by removing single value (when exists and doesn't exist)
    #   does exist
    value_to_remove = 'my'
    remove_1_response = requests.put(os.path.join(address, 'remove/' + id2 + '/' + value_to_remove))
    assert remove_1_response.status_code == 200
    add_list.remove(value_to_remove)
    assert remove_1_response.json() == {'id': id2, 'key': key_name2, 'valueList': value_list2 + add_list}
    #    does not exist
    remove_1_response = requests.put(os.path.join(address, 'remove/' + id1 + '/' + value_to_remove))
    assert remove_1_response.status_code == 200
    assert remove_1_response.json() == {'id': id1, 'key': key_name1, 'valueList': [value_to_add]}
    # test removing list values (when all exists, some exist, and none exist)
    #   all exist
    remove_all_list = ['This', 'is']
    remove_list_response = requests.put(os.path.join(address, 'remove/'+id2), json={'key': key_name2, 'valueList': remove_all_list})
    assert remove_list_response.status_code == 200
    for i in remove_all_list:
        value_list2.remove(i)
    assert remove_list_response.json() == {'id': id2, 'key': key_name2, 'valueList': value_list2+add_list}
    #   some exist
    remove_some_list = ['Nice', 'kitty']
    remove_list_response = requests.put(os.path.join(address, 'remove/'+id1), json={'key': key_name1, 'valueList': remove_some_list})
    assert remove_list_response.status_code == 200
    assert remove_list_response.json() == {'id': id1, 'key': key_name1, 'valueList': value_list1}
    #   None exist
    remove_none_list = ['I', 'am', 'no where']
    remove_list_response = requests.put(os.path.join(address, 'remove/'+id2), json={'key': key_name2, 'valueList': remove_none_list})
    assert remove_list_response.status_code == 200
    assert remove_list_response.json() == {'id': id2, 'key': key_name2, 'valueList': value_list2+add_list}
    #   Test retain when some exist
    remove_none_list = add_list + remove_none_list
    retain_list_response = requests.put(os.path.join(address, 'retain/'+id2), json={'key': key_name2, 'valueList': remove_none_list})
    assert retain_list_response.status_code == 200
    assert retain_list_response.json() == {'id': id2, 'key': key_name2, 'valueList': add_list}
    # Test delete
    delete_response = requests.delete(os.path.join(address, id1))
    assert delete_response.status_code == 200
    assert requests.get(os.path.join(address, 'getId/'+id1)).text == ''
    delete_response = requests.delete(os.path.join(address, id2))
    assert delete_response.status_code == 200
    assert requests.get(os.path.join(address, 'getId/'+id2)).text == ''