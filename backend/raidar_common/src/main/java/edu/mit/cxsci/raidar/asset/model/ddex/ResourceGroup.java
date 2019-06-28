package edu.mit.cxsci.raidar.asset.model.ddex;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class ResourceGroup {
	ResourceGroup ResourceGroupObject;
	ResourceGroupContentItem ResourceGroupContentItemObject;

	public ResourceGroup getResourceGroup() {
		return ResourceGroupObject;
	}

	public ResourceGroupContentItem getResourceGroupContentItem() {
		return ResourceGroupContentItemObject;
	}

	public void setResourceGroup(ResourceGroup ResourceGroupObject) {
		this.ResourceGroupObject = ResourceGroupObject;
	}

	public void setResourceGroupContentItem(ResourceGroupContentItem ResourceGroupContentItemObject) {
		this.ResourceGroupContentItemObject = ResourceGroupContentItemObject;
	}
}
