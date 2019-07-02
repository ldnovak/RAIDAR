package edu.mit.cxsci.raidar.data.converter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.mit.cxsci.raidar.asset.model.ddex.*;
import edu.mit.cxsci.raidar.asset.model.raidarp.Asset;
import edu.mit.cxsci.raidar.util.Utilities;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class RaidarToDDEX {

	public static void main(String[] args) {
		RaidarToDDEX app=new RaidarToDDEX();
		app.createDDEX();
	}
	
	private Asset FromJsonToModel() {
		String jsonString = Utilities.getInstance().loadJSONTest("data/raidar_data.json");
		//System.out.println(jsonString);
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Asset asset = new Asset();
		Gson gson = builder.create();
		
		asset = gson.fromJson(jsonString, Asset.class);
		
		return asset;
	}
	
	private void createDDEX() {
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Asset asset = FromJsonToModel();
		Gson gson = builder.create();
		//System.out.println(asset);
		String jsonString2 = gson.toJson(asset);
		//System.out.println(asset.getAssetHeaderInfo().getReceiver().getData());
	
		ParentObject pObj=new ParentObject();
		
		
		MessageHeader messageHeader = new MessageHeader();

		messageHeader.setMessageId(asset.getAssetHeaderInfo().getControl_nuumber().getData());
		messageHeader.setMessageThreadId(asset.getAssetHeaderInfo().getControl_nuumber_identifier().getData());
		
		MessageRecipient rec=new MessageRecipient();
		PartyName pname=new PartyName();
		pname.setFullName(asset.getAssetHeaderInfo().getReceiver().getData());
		rec.setPartyName(pname);
		messageHeader.setMessageRecipient(rec);
		
		MessageSender sender=new MessageSender();
		pname=new PartyName();
		pname.setFullName(asset.getAssetHeaderInfo().getSender().getData());
		sender.setPartyName(pname);
		messageHeader.setMessageSender(sender);
		
		pObj.setMessageHeader(messageHeader);
		String jsonString3 = gson.toJson(pObj);
		System.out.println(jsonString3);
	}

}
