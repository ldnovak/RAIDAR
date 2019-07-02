package edu.mit.cxsci.raidar.asset.model.ddex;

/**
*
* @author  Mizanul H. Chowdhuury
* @version 1.0
* @since   2014-03-31
**/

import java.util.ArrayList;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class ReleaseDetailsByTerritory {
	private String TerritoryCode;
	private String DisplayArtistName;
	private String LabelName;
	ArrayList<Object> Title = new ArrayList<Object>();
	DisplayArtist DisplayArtistObject;
	RelatedRelease RelatedReleaseObject;
	private String ParentalWarningType;
	ResourceGroup ResourceGroupObject;
	Genre GenreObject;
	private String OriginalReleaseDate;

	public String getTerritoryCode() {
		return TerritoryCode;
	}

	public String getDisplayArtistName() {
		return DisplayArtistName;
	}

	public String getLabelName() {
		return LabelName;
	}

	public DisplayArtist getDisplayArtist() {
		return DisplayArtistObject;
	}

	public RelatedRelease getRelatedRelease() {
		return RelatedReleaseObject;
	}

	public String getParentalWarningType() {
		return ParentalWarningType;
	}

	public ResourceGroup getResourceGroup() {
		return ResourceGroupObject;
	}

	public Genre getGenre() {
		return GenreObject;
	}

	public String getOriginalReleaseDate() {
		return OriginalReleaseDate;
	}

	public void setTerritoryCode(String TerritoryCode) {
		this.TerritoryCode = TerritoryCode;
	}

	public void setDisplayArtistName(String DisplayArtistName) {
		this.DisplayArtistName = DisplayArtistName;
	}

	public void setLabelName(String LabelName) {
		this.LabelName = LabelName;
	}

	public void setDisplayArtist(DisplayArtist DisplayArtistObject) {
		this.DisplayArtistObject = DisplayArtistObject;
	}

	public void setRelatedRelease(RelatedRelease RelatedReleaseObject) {
		this.RelatedReleaseObject = RelatedReleaseObject;
	}

	public void setParentalWarningType(String ParentalWarningType) {
		this.ParentalWarningType = ParentalWarningType;
	}

	public void setResourceGroup(ResourceGroup ResourceGroupObject) {
		this.ResourceGroupObject = ResourceGroupObject;
	}

	public void setGenre(Genre GenreObject) {
		this.GenreObject = GenreObject;
	}

	public void setOriginalReleaseDate(String OriginalReleaseDate) {
		this.OriginalReleaseDate = OriginalReleaseDate;
	}
}
