package edu.mit.cxsci.raidar.asset.model.raidar;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.AssetSubTitle;
import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.AssetTitle;
import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ControlNumber;
import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ControlNumberIdentifier;
import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Copyright;
import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Leader;
import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Receiver;
import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Sender;
import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Token;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class AssetHeaderInfo {
	public String getLeader() {
		return Leader;
	}
	public void setLeader(String leader) {
		Leader = leader;
	}
	public String getControlNumber() {
		return ControlNumber;
	}
	public void setControlNumber(String controlNumber) {
		ControlNumber = controlNumber;
	}
	public String getControlNumberIdentifier() {
		return ControlNumberIdentifier;
	}
	public void setControlNumberIdentifier(String controlNumberIdentifier) {
		ControlNumberIdentifier = controlNumberIdentifier;
	}
	public String getReceiver() {
		return Receiver;
	}
	public void setReceiver(String receiver) {
		Receiver = receiver;
	}
	public String getSender() {
		return Sender;
	}
	public void setSender(String sender) {
		Sender = sender;
	}
	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
	public String getAssetTitle() {
		return AssetTitle;
	}
	public void setAssetTitle(String assetTitle) {
		AssetTitle = assetTitle;
	}
	public String getAssetSubTitle() {
		return AssetSubTitle;
	}
	public void setAssetSubTitle(String assetSubTitle) {
		AssetSubTitle = assetSubTitle;
	}
	public String getCopyright() {
		return Copyright;
	}
	public void setCopyright(String copyright) {
		Copyright = copyright;
	}

	private String Leader;
	private String ControlNumber;
	private String ControlNumberIdentifier;
	private String Receiver;
	private String Sender;
	private String Token;
	private String AssetTitle;
	private String AssetSubTitle;
	private String Copyright;

	
}
