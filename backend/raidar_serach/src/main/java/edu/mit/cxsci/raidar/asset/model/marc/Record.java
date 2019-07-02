package edu.mit.cxsci.raidar.asset.model.marc;

import java.util.ArrayList;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 * @since 2014-03-31
 **/

public class Record {
	private String leader;
	ArrayList<ControlField> controlfields = new ArrayList<ControlField>();
	ArrayList<DataField> datafields = new ArrayList<DataField>();

	public ArrayList<ControlField> getControlfield() {
		return controlfields;
	}

	public void setControlfield(ArrayList<ControlField> controlfields) {
		this.controlfields = controlfields;
	}

	public ArrayList<DataField> getDatafield() {
		return datafields;
	}

	public void setDatafield(ArrayList<DataField> datafields) {
		this.datafields = datafields;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}
}