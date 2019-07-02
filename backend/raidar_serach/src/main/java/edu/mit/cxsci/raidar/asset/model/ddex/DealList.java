package edu.mit.cxsci.raidar.asset.model.ddex;

import java.util.ArrayList;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class DealList {
	ArrayList<ReleaseDeal> release = new ArrayList<ReleaseDeal>();

	public ArrayList<ReleaseDeal> getRelease() {
		return release;
	}

	public void setRelease(ArrayList<ReleaseDeal> release) {
		release = release;
	}
}
