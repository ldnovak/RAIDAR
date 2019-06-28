package edu.mit.cxsci.raidar.asset.model.raidar;

import java.util.Date;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class AudioRecording {
	private Date recording_date;
	private String duration;
	private String title_of_track;
	private String recording_id;
	private String type;
	private String reference;
	ReferenceTitle reference_title;
	DisplayArtist display_artist;

	public Date getRecordingDate() {
		return recording_date;
	}

	public void setRecordingDate(Date date) {
		this.recording_date = date;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTitleOfTrack() {
		return title_of_track;
	}

	public void setTitleOfTrack(String title) {
		this.title_of_track = title;
	}

	public String getID() {
		return recording_id;
	}

	public void setID(String iD) {
		recording_id = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public ReferenceTitle getReferenceTitleObject() {
		return reference_title;
	}

	public void setReferenceTitleObject(ReferenceTitle referenceTitleObject) {
		this.reference_title = referenceTitleObject;
	}

	public DisplayArtist getDisplayArtistObject() {
		return display_artist;
	}

	public void setDisplayArtistObject(DisplayArtist displayArtistObject) {
		this.display_artist = displayArtistObject;
	}

}
