package edu.mit.cxsci.raidar.asset.model.raider;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class ImageList {
	private String image_type;
	private String image_id;
	ImageDetailsByTerritory image_details_by_territory;



	public String getImageType() {
		return image_type;
	}

	public String getImageId() {
		return image_id;
	}

	public ImageDetailsByTerritory getImageDetailsByTerritory() {
		return image_details_by_territory;
	}



	public void setImageType(String ImageType) {
		this.image_type = ImageType;
	}

	public void setImageId(String ImageId) {
		this.image_id = ImageId;
	}

	public void setImageDetailsByTerritory(ImageDetailsByTerritory imageDetailsByTerritoryObject) {
		this.image_details_by_territory = imageDetailsByTerritoryObject;
	}
}
