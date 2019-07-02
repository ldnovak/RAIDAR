package edu.mit.cxsci.raidar.asset.model.marc;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 * @since 2014-03-31
 **/

public class MarcCollection {
	Record RecordObject;

	public Record getRecord() {
		return RecordObject;
	}

	public void setRecord(Record recordObject) {
		this.RecordObject = recordObject;
	}
}
