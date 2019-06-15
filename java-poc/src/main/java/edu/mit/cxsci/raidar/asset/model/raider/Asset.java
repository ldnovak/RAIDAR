package edu.mit.cxsci.raidar.asset.model.raider;

import java.util.ArrayList;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class Asset {
	private AssetHeaderInfo asset_header_info;
	private AssetResourceList asset_resource_list;
	private ReleaseList release_list;
	private DealList deal_list;

	public AssetHeaderInfo getAssetHeaderInfo() {
		return asset_header_info;
	}

	public void setAssetHeaderInfo(AssetHeaderInfo assetHeaderInfo) {
		this.asset_header_info = assetHeaderInfo;
	}

	public AssetResourceList getAssetResourceList() {
		return asset_resource_list;
	}

	public void setAssetResourceList(AssetResourceList assetResourceList) {
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
