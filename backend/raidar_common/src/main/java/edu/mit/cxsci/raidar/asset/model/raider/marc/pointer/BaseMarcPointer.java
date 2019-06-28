package edu.mit.cxsci.raidar.asset.model.raider.marc.pointer;

import com.google.gson.annotations.Expose;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class BaseMarcPointer {
	private String data;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	private transient String marc_pointer;

	public String getMarc_pointer() {
		return marc_pointer;
	}
	public void setMarc_pointer(String marc_pointer) {
		this.marc_pointer = marc_pointer;
	}
}
