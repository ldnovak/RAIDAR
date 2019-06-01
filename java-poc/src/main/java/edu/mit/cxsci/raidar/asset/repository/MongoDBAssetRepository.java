package edu.mit.cxsci.raidar.asset.repository;

import com.google.gson.JsonObject;
import edu.mit.cxsci.raidar.asset.model.Asset;
import edu.mit.cxsci.raidar.util.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author srmoore
 */
public class MongoDBAssetRepository implements AssetRepository {

	// Collection name in the MongoDB. TODO: Make this come from application.properties
	private String COLLECTION = "AssetCollection";

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Asset addAsset(Asset assetToAdd) {
		// get the canonical class name so we can reconstitute the proper object when pulling from DB
		String className = assetToAdd.getClass().getCanonicalName();
		JsonObject assetJson = assetToAdd.toJson();
		assetJson.addProperty("JavaClassName",className);

		return null;
	}

	@Override
	public Asset getAsset(String id) {

		//Asset lookupAsset = Class.forName("foo").newInstance();
		//lookupAsset.fromJson(jsonObject);
		return null;
	}

	@Override
	public Asset updateAsset(Asset assetToUpdate) {
		return null;
	}

	@Override
	public void removeAsset(Asset assetToRemove) {

	}
}
