# TODO add logging
import os
import requests
import json
from search_api.json_template_maker import non_query_maker, fuzzy_maker, query_string_maker, bool_maker, match_all
from search_api.api_settings import api
from search_api.api_models import search_model
from flask_restplus import Resource
from flask import request, make_response, jsonify

ns = api.namespace('search', description='Operations related to searching')
# TODO add this to settings file
username = 'elastic'
password = 'i2WwruacD9GmBWaGKdjFElQB'

address = 'https://5d6ad46d00984702b87fe0b2492309b3.us-east-1.aws.found.io:9243/test1'
search_address = os.path.join(address, '_search')
doc_address = os.path.join(address, '_doc')  # TODO add to settings to make sure

# response = requests.get(os.path.join(search_address, '?q=tags:happy'), auth=(username, password))
# print(response.json())


def format_response(response):
    """
    turns a 'requests' response into appropriate response for api
    :param response: 'requests' package response
    :return: 'flask' response type
    """
    response_json = jsonify(response.json())
    response_code = response.status_code
    return make_response(response_json, response_code)


@ns.route('/')
class SearchCollection(Resource):

    # @api.marshal_with(search_model)
    def get(self):
        """
        :return: tags of all musics TODO update
        """
        response = requests.get(search_address, auth=(username, password), json=match_all)
        return format_response(response)

    @api.response(201, "Search type successfully created")
    @api.expect(search_model)
    def post(self):
        """
        creates new music with tags
        """
        data = request.json
        response = requests.post(doc_address, auth=(username, password), json=data)
        return format_response(response)

@ns.route('/<string:id>')
@api.response(404, "id not found")
class SearchId(Resource):

    # @api.marshal_with(search_model)
    def get(self, id):
        """
        :return: tagged music with matching id
        """
        response = requests.get(os.path.join(search_address, '?q=_id:' + id), auth=(username, password))
        # response = requests.get(os.path.join(search_address, '?q=_id:' + str(id)), auth=(username, password))
        return format_response(response)

    @api.response(200, "Search type successfully updated")  # TODO make sure code is correct
    @api.expect(search_model)
    def put(self, id):
        data = request.json
        response = requests.put(os.path.join(doc_address, id), auth=(username, password), json=data)
        return format_response(response)

    @api.response(200, "Search type successfully deleted")  # TODO make sure code is correct
    def delete(self, id):
        response = requests.delete(os.path.join(doc_address, id), auth=(username, password))
        return format_response(response)

@ns.route('/search/basic')
class SearchBasic(Resource):

    # TODO @api.expect(model)
    def get(self):
        pass

def get_just_tags(tag_list, fuzziness="AUTO", max_expansions=50, _source=list("*"), size=10):
    """
    for getting tags with only a list of tags to automake fuzziness -- faze out when find a solution for fuzziness
    :param tag_list:
    :param fuzziness:
    :param max_expansions:
    :param _source:
    :param size:
    :return:
    """
    query_string = ''.join(tag_list)
    json_search = non_query_maker(_source=_source, size=size, highlight="tags")
    json_search["query"] = fuzzy_maker(query_string, 'tags', fuzziness=fuzziness,
                                                           max_expansions=max_expansions)
    response = requests.get(search_address, auth=(username, password), json=json_search)
    return response


def get_query(query_string, fields =list("tags"), _source=list("*"), size=10, from_index=0, highlight=None):
    json_search = non_query_maker( _source=_source, size=size, from_index=from_index,
                                                       highlight=highlight)
    json_search["query"] = query_string_maker(query_string, fields)
    response = requests.get(search_address, auth=(username, password), json=json_search)
    return response


def get_combine_query(query_string_list, fields_list, bool_term_list, _source=list("*"), size=10, from_index=0, highlight=None):
    if len(query_string_list) != len(fields_list) != len(bool_term_list) or len(bool_term_list) < 2:
        raise SyntaxError
    json_search = non_query_maker(_source=_source, size=size, from_index=from_index,
                                                      highlight=highlight)
    query_list = []
    for i in range(len(query_string_list)):
        query_list.append(query_string_maker(query_string_list[i], fields_list[i]))
    json_search["query"] = bool_maker(query_list, bool_term_list)
    response = requests.get(search_address, auth=(username, password), json=json_search)
    return response


# def put_json()
