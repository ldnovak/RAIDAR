package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class ReleaseDeal {
	private String DealReleaseReference;
	Deal DealObject;

	public String getDealReleaseReference() {
		return DealReleaseReference;
	}

	public Deal getDeal() {
		return DealObject;
	}

	public void setDealReleaseReference(String DealReleaseReference) {
		this.DealReleaseReference = DealReleaseReference;
	}

	public void setDeal(Deal DealObject) {
		this.DealObject = DealObject;
	}
}
