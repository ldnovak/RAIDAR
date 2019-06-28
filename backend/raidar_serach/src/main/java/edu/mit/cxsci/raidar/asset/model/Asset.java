package edu.mit.cxsci.raidar.asset.model;

import com.google.gson.JsonObject;

public interface Asset {

    public String getId();

    public JsonObject toJson();

    public void parseJson(String jsonString);
}
