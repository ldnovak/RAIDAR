import os
import requests
from json_template_maker import template_maker
import request_functions

username = 'elastic'
password = 'eFGJWOCIImHFGNlDpEszZe9v'

address = 'https://d4854130fadc4ce8bd62135d399a9aae.us-east-1.aws.found.io:9243/test1'
search_address = os.path.join(address, '_search')
template_address = os.path.join(search_address, 'template')

# response = requests.get(os.path.join(search_address, '?q=tags:happy'), auth=(username, password))
# response = requests.get(search_address, auth=(username, password), json={"query": {"terms": {"tags": ["happy"]}}})
# response = requests.get(template_address, auth=(username, password))
# response = requests.get(search_address, auth=(username, password), json={"query": {"match": {"tags": "happy"}}})
# response = requests.get(search_address, auth=(username, password), json={"query":
#                                                                              {"multi_match":
#                                                                                  {"query": "happy",
#                                                                                   "fields": ["tags"]}},
#                                                                          "size": 1,
#                                                                          "_source": ["tags"],
#                                                                          "highlight": {
#                                                                              "fields": {
#                                                                                  "tags": {}
#                                                                              }
#                                                                          }})
# response = requests.get(search_address, auth=(username, password), json=template_maker("happy", ["tags"], _source=["tags", "name"], size=10, highlight="tags"))
# print(response.json())

# print(request_functions.get_id(1))

# print(request_functions.get_query("happy", ["tags"]))

print(request_functions.get_combine_query(["happy", "Mark"], [["tags"], ["name", "producers"]], ["should", "must_not"]))