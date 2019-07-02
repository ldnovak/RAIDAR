package edu.mit.cxsci.raidar.asset.model.raidar;

import java.util.ArrayList;
import java.util.Date;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class DisplayArtist {
	private ArrayList<Identity> full_names = new ArrayList<Identity>();
	private Date date;
	private ArrayList<ContactInfo> contact_infos = new ArrayList<ContactInfo>();
	private ArrayList<String> artist_roles = new ArrayList<String>();
	private ArrayList<String> group_name = new ArrayList<String>();
	private ArrayList<String> references = new ArrayList<String>();
	private String label_name;
	private String recording_right;
	private String lyrics;
	private String genre;
	private AudioTechnicalDetail audio_technical_detail;
	private String ethnicity;
	private String gender;

	public ArrayList<Identity> getFullNames() {
		return full_names;
	}
	public void setFullNames(ArrayList<Identity> fullNames) {
		this.full_names = fullNames;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ArrayList<ContactInfo> getContactInfos() {
		return contact_infos;
	}
	public void setContactInfos(ArrayList<ContactInfo> contactInfos) {
		this.contact_infos = contactInfos;
	}
	public ArrayList<String> getArtistRoles() {
		return artist_roles;
	}
	public void setArtistRoles(ArrayList<String> artistRoles) {
		this.artist_roles = artistRoles;
	}
	public ArrayList<String> getGroupName() {
		return group_name;
	}
	public void setGroupName(ArrayList<String> groupName) {
		this.group_name = groupName;
	}
	public ArrayList<String> getReferences() {
		return references;
	}
	public void setReferences(ArrayList<String> references) {
		this.references = references;
	}
	public String getLabelName() {
		return label_name;
	}
	public void setLabelName(String labelName) {
		this.label_name = labelName;
	}
	public String getRecordingRight() {
		return recording_right;
	}
	public void setRecordingRight(String recordingRight) {
		this.recording_right = recordingRight;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public AudioTechnicalDetail getAudioTechnicalDetailObject() {
		return audio_technical_detail;
	}
	public void setAudioTechnicalDetailObject(AudioTechnicalDetail audioTechnicalDetailObject) {
		this.audio_technical_detail = audioTechnicalDetailObject;
	}
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
