package edu.mit.cxsci.raidar.asset.model.raidarp;

import java.util.ArrayList;
import java.util.Date;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class Artist {
	private ArrayList<Identity> full_names = new ArrayList<Identity>();
	private ArrayList<ContactInfo> contact_infos = new ArrayList<ContactInfo>();
	private ArrayList<ArtistRole> artist_roles = new ArrayList<ArtistRole>();
	private ArrayList<GroupName> group_name = new ArrayList<GroupName>();
	private ArrayList<Reference> references = new ArrayList<Reference>();
	private LabelName label_name;
	private RecordingRight recording_right;
	private Lyric lyrics;
	private Genre genre;
	private AudioTechnicalDetail audio_technical_detail;
	private Ethnicity ethnicity;
	private Gender gender;

	public ArrayList<Identity> getFull_names() {
		return full_names;
	}

	public void setFull_names(ArrayList<Identity> full_names) {
		this.full_names = full_names;
	}

	public ArrayList<ContactInfo> getContact_infos() {
		return contact_infos;
	}

	public void setContact_infos(ArrayList<ContactInfo> contact_infos) {
		this.contact_infos = contact_infos;
	}

	public ArrayList<ArtistRole> getArtist_roles() {
		return artist_roles;
	}

	public void setArtist_roles(ArrayList<ArtistRole> artist_roles) {
		this.artist_roles = artist_roles;
	}

	public ArrayList<GroupName> getGroup_name() {
		return group_name;
	}

	public void setGroup_name(ArrayList<GroupName> group_name) {
		this.group_name = group_name;
	}

	public ArrayList<Reference> getReferences() {
		return references;
	}

	public void setReferences(ArrayList<Reference> references) {
		this.references = references;
	}

	public LabelName getLabel_name() {
		return label_name;
	}

	public void setLabel_name(LabelName label_name) {
		this.label_name = label_name;
	}

	public RecordingRight getRecording_right() {
		return recording_right;
	}

	public void setRecording_right(RecordingRight recording_right) {
		this.recording_right = recording_right;
	}

	public Lyric getLyrics() {
		return lyrics;
	}

	public void setLyrics(Lyric lyrics) {
		this.lyrics = lyrics;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public AudioTechnicalDetail getAudio_technical_detail() {
		return audio_technical_detail;
	}

	public void setAudio_technical_detail(AudioTechnicalDetail audio_technical_detail) {
		this.audio_technical_detail = audio_technical_detail;
	}

	public Ethnicity getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(Ethnicity ethnicity) {
		this.ethnicity = ethnicity;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
