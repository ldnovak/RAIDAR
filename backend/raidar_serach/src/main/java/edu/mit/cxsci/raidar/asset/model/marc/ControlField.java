package edu.mit.cxsci.raidar.asset.model.marc;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class ControlField {
	private String tag;
	private String data;

	public String getValue() {
		return data;
	}

	public void setValue(String value) {
		this.data = value;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
