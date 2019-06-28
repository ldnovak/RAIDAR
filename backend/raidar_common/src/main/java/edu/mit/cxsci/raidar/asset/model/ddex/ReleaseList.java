package edu.mit.cxsci.raidar.asset.model.ddex;

import java.util.ArrayList;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class ReleaseList {
	ArrayList<Release> release = new ArrayList<Release>();

	public ArrayList<Release> getRelease() {
		return release;
	}

	public void setRelease(ArrayList<Release> release) {
		release = release;
	}
}
