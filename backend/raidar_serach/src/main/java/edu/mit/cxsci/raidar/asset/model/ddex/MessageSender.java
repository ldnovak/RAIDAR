package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class MessageSender {
	private String PartyId;
	PartyName PartyName;

	public String getPartyId() {
		return PartyId;
	}

	public PartyName getPartyName() {
		return PartyName;
	}

	public void setPartyId(String PartyId) {
		this.PartyId = PartyId;
	}

	public void setPartyName(PartyName PartyNameObject) {
		this.PartyName = PartyNameObject;
	}
}
