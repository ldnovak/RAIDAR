# TODO logging
from flask import Flask, Blueprint  #, request, make_response, jsonify, abort
from search_api.api_settings import api
from search_api.request_functions import ns as search_namespace

app = Flask(__name__)

def configure_app(app):
    # TODO add configs
    pass


def init_app(app):
    configure_app(app)

    blueprint = Blueprint('api', __name__, url_prefix='/api')
    api.init_app(blueprint)
    # TODO add namespace for search
    api.add_namespace(search_namespace)
    app.register_blueprint(blueprint)


init_app(app)

if __name__ == '__main__':
    app.run(debug=True)



# '''
# returns error for 404 not found
# '''
# @app.errorhandler(404)
# def not_found(error):
#     return make_response(jsonify({"error": "Not Found"}), 404)
#
#
# @app.route('/id/<int:id>', methods=['GET'])
# def get_id(id):
#     response = request_functions.get_id(id)
#     return make_response(jsonify(response.json()), response.status_code)
#
#
# @app.route('/tags', methods=["GET"])
# def get_just_tags():
#     if not request.json:
#         abort(404)
#     # TODO other fields
#     tag_list = request.json.get('tags')
#     response = request_functions.get_just_tags(tag_list)
#     return make_response(jsonify(response.json()), response.status_code)

