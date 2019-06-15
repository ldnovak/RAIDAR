package edu.mit.cxsci.raidar.asset.model.raider;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class ReleaseId {
	private String GRid;
	ICPN ICPNObject;



	public String getGRid() {
		return GRid;
	}

	public ICPN getICPN() {
		return ICPNObject;
	}



	public void setGRid(String GRid) {
		this.GRid = GRid;
	}

	public void setICPN(ICPN ICPNObject) {
		this.ICPNObject = ICPNObject;
	}
}