package edu.mit.cxsci.raidar.asset.model.marc;

import java.util.ArrayList;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class DataField {
	private String tag;
	private String ind1;
	private String ind2;
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getInd1() {
		return ind1;
	}

	public void setInd1(String ind1) {
		this.ind1 = ind1;
	}

	public String getInd2() {
		return ind2;
	}

	public void setInd2(String ind2) {
		this.ind2 = ind2;
	}

	ArrayList<SubField> subfield = new ArrayList<SubField>();

	public ArrayList<SubField> getSubfield() {
		return subfield;
	}

	public void setSubfield(ArrayList<SubField> subfield) {
		this.subfield = subfield;
	}

}
