package edu.mit.cxsci.raidar.asset.model;

import com.google.gson.JsonObject;

import edu.mit.cxsci.raidar.util.GsonUtil;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * @author srmoore
 */
@Document(collection = "assets")
public class AbstractAsset implements Asset {

	// Unique (to this instance) ID
	@Id
	private String id;

	public AbstractAsset(){
		this.id = UUID.randomUUID().toString();
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public JsonObject toJson(){
		return (JsonObject) GsonUtil.gson.toJsonTree(this);
	}

	@Override
	public void parseJson(String jsonString) {
		// TODO Auto-generated method stub
		
	}
}
