package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class Image {
	private String ImageType;
	ImageId ImageIdObject;
	private String ResourceReference;
	ImageDetailsByTerritory ImageDetailsByTerritoryObject;

	public String getImageType() {
		return ImageType;
	}

	public ImageId getImageId() {
		return ImageIdObject;
	}

	public String getResourceReference() {
		return ResourceReference;
	}

	public ImageDetailsByTerritory getImageDetailsByTerritory() {
		return ImageDetailsByTerritoryObject;
	}

	public void setImageType(String ImageType) {
		this.ImageType = ImageType;
	}

	public void setImageId(ImageId ImageIdObject) {
		this.ImageIdObject = ImageIdObject;
	}

	public void setResourceReference(String ResourceReference) {
		this.ResourceReference = ResourceReference;
	}

	public void setImageDetailsByTerritory(ImageDetailsByTerritory ImageDetailsByTerritoryObject) {
		this.ImageDetailsByTerritoryObject = ImageDetailsByTerritoryObject;
	}
}
