from search_api.api_settings import api
from flask_restplus import fields

search_model = api.model('Search Instance', {
                          # '_id': fields.String(readOnly=True, description="Unique id of search instance"),
                          'name': fields.String(required=True, description="Name of piece of work"),
                          'writers': fields.List(fields.String(description="Writers of the piece")),
                          'producers': fields.List(fields.String(description="Producers of the piece")),
                          'tags': fields.List(fields.String(description="tags given to the piece"))
                            }
                          )
