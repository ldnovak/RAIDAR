package edu.mit.cxsci.raidar.asset.model.raider;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class DealTerms {
	private String CommercialModelType;
	Usage UsageObject;
	private String TerritoryCode;
	PriceInformation PriceInformationObject;
	ValidityPeriod ValidityPeriodObject;
	private String PreOrderReleaseDate;
	private String PreOrderPreviewDate;



	public String getCommercialModelType() {
		return CommercialModelType;
	}

	public Usage getUsage() {
		return UsageObject;
	}

	public String getTerritoryCode() {
		return TerritoryCode;
	}

	public PriceInformation getPriceInformation() {
		return PriceInformationObject;
	}

	public ValidityPeriod getValidityPeriod() {
		return ValidityPeriodObject;
	}

	public String getPreOrderReleaseDate() {
		return PreOrderReleaseDate;
	}

	public String getPreOrderPreviewDate() {
		return PreOrderPreviewDate;
	}



	public void setCommercialModelType(String CommercialModelType) {
		this.CommercialModelType = CommercialModelType;
	}

	public void setUsage(Usage UsageObject) {
		this.UsageObject = UsageObject;
	}

	public void setTerritoryCode(String TerritoryCode) {
		this.TerritoryCode = TerritoryCode;
	}

	public void setPriceInformation(PriceInformation PriceInformationObject) {
		this.PriceInformationObject = PriceInformationObject;
	}

	public void setValidityPeriod(ValidityPeriod ValidityPeriodObject) {
		this.ValidityPeriodObject = ValidityPeriodObject;
	}

	public void setPreOrderReleaseDate(String PreOrderReleaseDate) {
		this.PreOrderReleaseDate = PreOrderReleaseDate;
	}

	public void setPreOrderPreviewDate(String PreOrderPreviewDate) {
		this.PreOrderPreviewDate = PreOrderPreviewDate;
	}
}
