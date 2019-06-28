package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class ResourceGroupContentItem {
	private String ResourceType;
	private String ReleaseResourceReference;

	public String getResourceType() {
		return ResourceType;
	}

	public String getReleaseResourceReference() {
		return ReleaseResourceReference;
	}

	public void setResourceType(String ResourceType) {
		this.ResourceType = ResourceType;
	}

	public void setReleaseResourceReference(String ReleaseResourceReference) {
		this.ReleaseResourceReference = ReleaseResourceReference;
	}
}
