package edu.mit.cxsci.raidar.asset.repository;

import com.google.gson.JsonObject;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import edu.mit.cxsci.raidar.asset.model.Asset;
import edu.mit.cxsci.raidar.util.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * @author srmoore
 */

public class MongoDBAssetRepository implements AssetRepository {


	// Collection name in the MongoDB. TODO: Make this come from application.properties
	private static final String COLLECTION = "AssetCollection";

	// Field Name to use to store the java class name so we can reconstitute the proper object type.
	private static final String JAVA_CLASS_NAME = "JavaClassName";

	@Autowired
	private MongoTemplate mongoTemplate;

	private Asset fromBasicDBObject(BasicDBObject dbObject) {
		String className = dbObject.getString(JAVA_CLASS_NAME);
		try {
			Asset returnAsset = (Asset) Class.forName(className).newInstance();
			returnAsset.parseJson(dbObject.toJson());
			return returnAsset;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Asset addAsset(Asset assetToAdd) {

		// get the canonical class name so we can reconstitute the proper object when pulling from DB
		String className = assetToAdd.getClass().getCanonicalName();
		JsonObject assetJson = assetToAdd.toJson();
		assetJson.addProperty(JAVA_CLASS_NAME,className);
		BasicDBObject document = BasicDBObject.parse(assetJson.toString());
		BasicDBObject returnDoc = mongoTemplate.insert(document);
		return fromBasicDBObject(returnDoc);

	}

	@Override
	public Asset getAsset(String id) {

		Query q = new Query();
		q.addCriteria(Criteria.where("_id").is(id));

		Asset returnAsset = fromBasicDBObject(mongoTemplate.findOne(q, BasicDBObject.class, COLLECTION));
		return returnAsset;
	}

	@Override
	public Asset updateAsset(Asset assetToUpdate) {
		return null;
	}

	@Override
	public void removeAsset(Asset assetToRemove) {

	}
}
