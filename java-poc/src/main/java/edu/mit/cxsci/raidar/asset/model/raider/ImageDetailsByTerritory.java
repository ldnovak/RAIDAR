package edu.mit.cxsci.raidar.asset.model.raider;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class ImageDetailsByTerritory {
	private String territory_code;
	private String image_id;
	private String image_details_by_territory;



	public String getTerritoryCode() {
		return territory_code;
	}

	public String getImageId() {
		return image_id;
	}

	public String getImageDetailsByTerritory() {
		return image_details_by_territory;
	}



	public void setTerritoryCode(String TerritoryCode) {
		this.territory_code = TerritoryCode;
	}

	public void setImageId(String ImageId) {
		this.image_id = ImageId;
	}

	public void setImageDetailsByTerritory(String ImageDetailsByTerritory) {
		this.image_details_by_territory = ImageDetailsByTerritory;
	}
}
