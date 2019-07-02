package edu.mit.cxsci.raidar.asset.model.marc;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class SubField {
	private String code;
	private String data;

	public String getValue() {
		return data;
	}

	public void setValue(String value) {
		this.data = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
