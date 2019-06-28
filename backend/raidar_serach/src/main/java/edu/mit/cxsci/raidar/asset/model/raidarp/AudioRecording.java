package edu.mit.cxsci.raidar.asset.model.raidarp;

import java.util.ArrayList;
import java.util.Date;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 * @since 2014-03-31
 **/

public class AudioRecording {
	private RecordingDate RecordingDate;
	private Duration Duration;
	private TitleOfTrack title_of_track;
	private RecordingId RecordingId;
	private RecordingType RecordingType;
	private String Reference;
	private ArrayList<Title> Title = new ArrayList<Title>();
	private Artist Artist;
	private PublisherNumber PublisherNumber;

	public PublisherNumber getPublisher_number() {
		return PublisherNumber;
	}

	public void setPublisher_number(PublisherNumber publisher_number) {
		this.PublisherNumber = publisher_number;
	}

	public RecordingDate getRecordingDate() {
		return RecordingDate;
	}

	public void setRecordingDate(RecordingDate date) {
		this.RecordingDate = date;
	}

	public Duration getDuration() {
		return Duration;
	}

	public void setDuration(Duration duration) {
		this.Duration = duration;
	}

	public TitleOfTrack getTitleOfTrack() {
		return title_of_track;
	}

	public void setTitleOfTrack(TitleOfTrack title) {
		this.title_of_track = title;
	}

	public RecordingId getRecordingId() {
		return RecordingId;
	}

	public void setRecordingId(RecordingId id) {
		RecordingId = id;
	}

	public RecordingType getRecordingType() {
		return RecordingType;
	}

	public void setRecordingType(RecordingType type) {
		this.RecordingType = type;
	}

	public String getReference() {
		return Reference;
	}

	public void setReference(String reference) {
		this.Reference = reference;
	}

	public ArrayList<Title> getReferenceTitleObject() {
		return Title;
	}

	public void setReferenceTitleObject(ArrayList<Title> referenceTitleObject) {
		this.Title = referenceTitleObject;
	}

	public Artist getDisplayArtistObject() {
		return Artist;
	}

	public void setDisplayArtistObject(Artist displayArtistObject) {
		this.Artist = displayArtistObject;
	}

}
