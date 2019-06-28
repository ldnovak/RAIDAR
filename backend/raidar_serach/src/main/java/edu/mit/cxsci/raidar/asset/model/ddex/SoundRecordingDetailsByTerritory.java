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


public class SoundRecordingDetailsByTerritory {
	private String TerritoryCode;
	ArrayList<Object> Title = new ArrayList<Object>();
	DisplayArtist DisplayArtistObject;
	private String LabelName;
	PLine PLineObject;
	Genre GenreObject;
	private String ParentalWarningType;
	TechnicalSoundRecordingDetails TechnicalSoundRecordingDetailsObject;

	public String getTerritoryCode() {
		return TerritoryCode;
	}

	public DisplayArtist getDisplayArtist() {
		return DisplayArtistObject;
	}

	public String getLabelName() {
		return LabelName;
	}

	public PLine getPLine() {
		return PLineObject;
	}

	public Genre getGenre() {
		return GenreObject;
	}

	public String getParentalWarningType() {
		return ParentalWarningType;
	}

	public TechnicalSoundRecordingDetails getTechnicalSoundRecordingDetails() {
		return TechnicalSoundRecordingDetailsObject;
	}

	public void setTerritoryCode(String TerritoryCode) {
		this.TerritoryCode = TerritoryCode;
	}

	public void setDisplayArtist(DisplayArtist DisplayArtistObject) {
		this.DisplayArtistObject = DisplayArtistObject;
	}

	public void setLabelName(String LabelName) {
		this.LabelName = LabelName;
	}

	public void setPLine(PLine PLineObject) {
		this.PLineObject = PLineObject;
	}

	public void setGenre(Genre GenreObject) {
		this.GenreObject = GenreObject;
	}

	public void setParentalWarningType(String ParentalWarningType) {
		this.ParentalWarningType = ParentalWarningType;
	}

	public void setTechnicalSoundRecordingDetails(TechnicalSoundRecordingDetails TechnicalSoundRecordingDetailsObject) {
		this.TechnicalSoundRecordingDetailsObject = TechnicalSoundRecordingDetailsObject;
	}
}
