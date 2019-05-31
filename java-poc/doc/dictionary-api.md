# Dictionary API

This document lists API endpoints for the 'dictionary' service used by RAIDAR. This service is intended to be a generic 
key/value store where keys can have multiple values for an entry. The first example of this is a Name lookup, where an
artist might have several aliases they have been known by. The HTTP based API will return JSON objects representing the 
data stored in the dictionary 

### JSON Object 

Properties of the JSON object

`id`:  This is a system specific Identifier as a string (Format is up to the service but has to be an ASCII representable string)

`keyType`: The type of data this is as a string. I.E. "name" (Values TBD)

`value`: Value(s) as an array of strings

`defaultDisplay`: Default string to display when showing this entry

`lastModified`: ISO 8601 UTC date and time stamp (i.e. `2019-05-31T13:40:23Z`) of when the entry was last modified

`createdAt`: ISO 8601 UTC date and time stamp of when the entry was created

```json
{
	id: "e0b473a5-9855-45c1-a501-4076d4ec9689",
	keyType: "name",
	value: ["Eddie Van Halen", "Edward Van Halen"],
	defaultDisplay: "Eddie Van Halen",
	lastModified: "2019-05-31T13:40:23Z",
	createdAt: "2019-05-31T13:40:23Z"
}
```

### Base API

##### NOTE: Proper Authentication TBD, most likely OAuth

#### Get by ID

`HTTP GET https://dictionary.example.org/entry/<id>`

Returns the JSON of the entry specified by <id>

#### Lookup by value

`HTTP GET https://dictionary.example.org/<type>/<value>`

Returns an array of JSON entries of `<type>` that have `<value>` in their `value` array or `defaultDisplay` properties


#### Store/Modify Entry

`HTTP POST https://dictionary.example.org/entry`

To Create a new entry, post JSON that contains `keyType`, `value`, and `defaultDisplay` properties. The rest of the 
properties will be generated.

To Modify an entry, post JSON that contains `id`, `keyType`, `value`, and `defaultDisplay` properties. The `createdAt` 
will be automatically retained, and `lastModified` will be updated appropriately.

On Success of either creation or modification, the service will return the new (full) JSON reporesentation of the entry 


