package edu.mit.cxsci.raidar.asset.model.ddex;

import java.util.ArrayList;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class Party {
	private PartyReference PartyReference;
	public PartyReference getPartyReference() {
		return PartyReference;
	}
	public void setPartyReference(PartyReference partyReference) {
		PartyReference = partyReference;
	}
	public ArrayList<PartyName> getPartyName() {
		return PartyName;
	}
	public void setPartyName(ArrayList<PartyName> partyName) {
		PartyName = partyName;
	}
	private ArrayList<PartyName> PartyName = new ArrayList<PartyName>();
}
