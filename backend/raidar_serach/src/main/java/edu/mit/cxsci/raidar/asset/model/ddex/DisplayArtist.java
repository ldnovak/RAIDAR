package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class DisplayArtist {
	PartyName PartyNameObject;
	private String ArtistRole;

	public PartyName getPartyName() {
		return PartyNameObject;
	}

	public String getArtistRole() {
		return ArtistRole;
	}

	public void setPartyName(PartyName PartyNameObject) {
		this.PartyNameObject = PartyNameObject;
	}

	public void setArtistRole(String ArtistRole) {
		this.ArtistRole = ArtistRole;
	}
}
