package edu.mit.cxsci.raidar.data.converter;

public class MarcPointer {
	private String tag;
	private String ind1;
	private String ind2;
	private String code;
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
