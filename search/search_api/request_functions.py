import os
import requests
import json
import json_template_maker

username = 'elastic'
password = 'eFGJWOCIImHFGNlDpEszZe9v'

address = 'https://d4854130fadc4ce8bd62135d399a9aae.us-east-1.aws.found.io:9243/test1'
search_address = os.path.join(address, '_search')

# response = requests.get(os.path.join(search_address, '?q=tags:happy'), auth=(username, password))
# print(response.json())


def get_id(id):
    response = requests.get(os.path.join(search_address, '?q=_id:'+str(id)), auth=(username, password))
    return response


def get_just_tags(tag_list, fuzziness="AUTO", max_expansions=50, _source=list("*"), size=10):
    query_string = ''.join(tag_list)
    json_search = json_template_maker.non_query_maker(_source=_source, size=size, highlight="tags")
    json_search["query"] = json_template_maker.fuzzy_maker(query_string, 'tags', fuzziness=fuzziness,
                                                           max_expansions=max_expansions)
    response = requests.get(search_address, auth=(username, password), json=json_search)
    return response


def get_query(query_string, fields = ["tags"], _source=list("*"), size=10, from_index=0, highlight=None):
    json_search = json_template_maker.non_query_maker( _source=_source, size=size, from_index=from_index,
                                                       highlight=highlight)
    json_search["query"] = json_template_maker.query_string_maker(query_string, fields)
    response = requests.get(search_address, auth=(username, password), json=json_search)
    return response


def get_combine_query(query_string_list, fields_list, bool_term_list, _source=list("*"), size=10, from_index=0, highlight=None):
    if len(query_string_list) != len(fields_list) != len(bool_term_list) or len(bool_term_list) < 2:
        raise SyntaxError
    json_search = json_template_maker.non_query_maker(_source=_source, size=size, from_index=from_index,
                                                      highlight=highlight)
    query_list = []
    for i in range(len(query_string_list)):
        query_list.append(json_template_maker.query_string_maker(query_string_list[i], fields_list[i]))
    json_search["query"] = json_template_maker.bool_maker(query_list, bool_term_list)
    response = requests.get(search_address, auth=(username, password), json=json_search)
    return response


# def put_json()
