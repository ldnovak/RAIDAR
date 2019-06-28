package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class RelatedRelease {
	ReleaseId ReleaseIdObject;
	private String ReleaseRelationshipType;

	public ReleaseId getReleaseId() {
		return ReleaseIdObject;
	}

	public String getReleaseRelationshipType() {
		return ReleaseRelationshipType;
	}

	public void setReleaseId(ReleaseId ReleaseIdObject) {
		this.ReleaseIdObject = ReleaseIdObject;
	}

	public void setReleaseRelationshipType(String ReleaseRelationshipType) {
		this.ReleaseRelationshipType = ReleaseRelationshipType;
	}
}
