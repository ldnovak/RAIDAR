from flask import Flask, request, make_response, jsonify, abort
from flask_restful import Resource, Api

import request_functions

app = Flask(__name__)
# api = Api(app)

'''
returns error for 404 not found
'''
@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({"error": "Not Found"}), 404)


@app.route('/id/<int:id>', methods=['GET'])
def get_id(id):
    response = request_functions.get_id(id)
    return make_response(jsonify(response.json()), response.status_code)


@app.route('/tags', methods=["GET"])
def get_just_tags():
    if not request.json:
        abort(404)
    # TODO other fields
    tag_list = request.json.get('tags')
    response = request_functions.get_just_tags(tag_list)
    return make_response(jsonify(response.json()), response.status_code)



if __name__ == '__main__':
    app.run(debug=True)