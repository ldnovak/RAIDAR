# TODO logging

from flask import jsonify, make_response
from flask_restplus import Api


api = Api(version="0.0.1", title="Database Searcher for Music", license="MIT",
          description="Search API for music in RAIDAR database")

# default error handler
@api.errorhandler
def default_error(e):
    error_message = 'An unhandled error occurred'
    # TODO log error
    # TODO settigns so if debug don't return error
    return make_response(jsonify({"Error": error_message}), 500)

