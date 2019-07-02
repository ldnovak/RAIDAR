package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class ImageDetailsByTerritory {
	private String TerritoryCode;
	TechnicalImageDetails TechnicalImageDetailsObject;

	public String getTerritoryCode() {
		return TerritoryCode;
	}

	public TechnicalImageDetails getTechnicalImageDetails() {
		return TechnicalImageDetailsObject;
	}

	public void setTerritoryCode(String TerritoryCode) {
		this.TerritoryCode = TerritoryCode;
	}

	public void setTechnicalImageDetails(TechnicalImageDetails TechnicalImageDetailsObject) {
		this.TechnicalImageDetailsObject = TechnicalImageDetailsObject;
	}
}
