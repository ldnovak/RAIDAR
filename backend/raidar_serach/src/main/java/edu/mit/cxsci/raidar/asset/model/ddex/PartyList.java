package edu.mit.cxsci.raidar.asset.model.ddex;

import java.util.ArrayList;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class PartyList {

	private ArrayList<Party> Party = new ArrayList<Party>();

	public ArrayList<Party> getParty() {
		return Party;
	}

	public void setParty(ArrayList<Party> party) {
		Party = party;
	}
	
}
