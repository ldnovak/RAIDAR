package edu.mit.cxsci.raidar.asset.model.raidar;

import java.util.ArrayList;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class Raidar {
	private RaidarHeaderInfo asset_header_info;
	private RaidarResourceList asset_resource_list;
	private ReleaseList release_list;
	private DealList deal_list;

	public RaidarHeaderInfo getAssetHeaderInfo() {
		return asset_header_info;
	}

	public void setAssetHeaderInfo(RaidarHeaderInfo assetHeaderInfo) {
		this.asset_header_info = assetHeaderInfo;
	}

	public RaidarResourceList getAssetResourceList() {
		return asset_resource_list;
	}

	public void setAssetResourceList(RaidarResourceList assetResourceList) {
		this.asset_resource_list = assetResourceList;
	}

	public ReleaseList getReleaseList() {
		return release_list;
	}

	public void setReleaseList(ReleaseList releaseList) {
		this.release_list = releaseList;
	}

	public DealList getDealList() {
		return deal_list;
	}

	public void setDealList(DealList dealList) {
		this.deal_list = dealList;
	}
}
