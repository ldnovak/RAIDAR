'''
ingorged:
common terms - https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-common-terms-query.html
match bool prefix - https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-multi-match-query.html


'''


'''
makes a multi match field
ex
        "multi_match" : {
            "query" : "elasticsearch guide",
            "fields": ["title", "summary^3"]
        }

:param query_string string that want to search for
:param fields list of strings of fields you want to search in
        note use ^int to boost certain fields
'''
def multi_match_maker(query_string, fields):
    return {"multi_match": {
                "query": query_string,
                "fields": fields
                }
            }

'''
can search for phrase with a slop
--> 'flying pigs' with slop 1 will find 'flying harry pigs'
'''
def match_phrase_maker(query_string, fields, slop=0):
    match_phrase_dict = multi_match_maker(query_string, fields)
    match_phrase_dict["multi_match"]["type"] = "phrase"
    match_phrase_dict["multi_match"]["slop"] = slop
    return match_phrase_dict

'''
poor mans auto-complete
will match initial phrase and find fields that match the rest

--> hap will find happy and happening
'''
def match_phrase_prefix_maker(query_string, fields, slop=0, max_expansions=10):
    match_phrase_dict = multi_match_maker(query_string, fields)
    match_phrase_dict["multi_match"]["type"] = "phrase_prefix"
    match_phrase_dict["multi_match"]["slop"] = slop
    match_phrase_dict["multi_match"]["max_expansions"] = max_expansions
    return match_phrase_dict


def fuzzy_maker(query_string, field, boost=1.0, fuzziness="AUTO", prefix_length=0, max_expansions=50):
    return {"fuzzy": {
                field: {
                    "value": query_string,
                    "boost": boost,
                    "fuzziness": fuzziness,
                    "prefix_length": prefix_length,
                    "max_expansions": max_expansions
            }

        }
    }

def wildcard_maker(query_string, field):
    return {"wildcard"}

def template_maker(query_string, fields, _source=list("*"), size=10, from_index=0, highlight=None):
    template = non_query_maker(_source=_source, size=size, from_index=from_index, highlight=highlight)
    template["query"] = query_string_maker(query_string, fields)
    # template["query"] = bool_maker([fuzzy_maker(query_string, fields), fuzzy_maker("Alice", "name")], ["must", "filter"])
    # print(bool_maker([fuzzy_maker(query_string, fields), fuzzy_maker(query_string, fields)], ["must", "must"]))
    return template


def highlight_maker(highlights_fields):
    """
    makes a basic highlight field dict as specified by elasticsearch
        see https://www.elastic.co/guide/en/elasticsearch/reference/current/search-request-highlighting.html
    :param highlights_fields: list of strings of fields want to highlight
    :return:  highlight field dict
    """
    highlight_dict = {"fields": {}}
    for field in highlights_fields:
        highlight_dict["fields"][field] = {}
    return highlight_dict


def non_query_maker(_source=list("*"), size=10, from_index=0, highlight=None):
    non_query_dict = {
        "_source": _source,
        "size": size,
        "from": from_index
    }
    if highlight:
        non_query_dict["highlight"] = highlight_maker(highlight)
    return non_query_dict




'''
Should be all that is needed:
query_string: https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-query-string-query.html
--> everything besides specific combinations of fields
bool: https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-bool-query.html
--> combine fields where each is specific
match_all
--> query for getting everything
'''


'fields must be list'
def query_string_maker(query_string, fields, default_operator="OR", phrase_slop=0, max_determinized_states=5000, auto_fuzzy=False):
    # if auto_fuzzy:
        # TODO
    query_string_dict = {"query_string": {
                                "fields": fields,
                                "query": query_string,
                                "default_operator": default_operator,
                                "phrase_slop": phrase_slop,
                                "max_determinized_states": max_determinized_states
                                }

    }
    return query_string_dict


bool_set = {"must", "filter", "must_not", "should"}

def bool_sorter(query_list, bool_list):
    if len(query_list) != len(bool_list) or len(query_list) < 2:
        raise SyntaxError
    bool_dict = {}
    for i in range(len(query_list)):
        bool_term = bool_list[i]
        if bool_term not in bool_set:
            raise SyntaxError
        query_term = query_list[i]
        if bool_term not in bool_dict:
            bool_dict[bool_term] = [query_term]
        else:
            bool_dict[bool_term].append(query_term)
    return bool_dict



def bool_maker(query_list, bool_list):
    if len(query_list) != len(bool_list) or len(query_list) < 2:
        raise SyntaxError
    bool_dict = {"bool": {}}
    sorted_bools = bool_sorter(query_list, bool_list)
    for bool_term in sorted_bools:
        bool_dict["bool"][bool_term] = sorted_bools[bool_term]
    return bool_dict


match_all = {"query": {"match_all": {}}}
