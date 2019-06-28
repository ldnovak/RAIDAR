package edu.mit.cxsci.raidar.asset.model.raidar;

import java.util.ArrayList;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class AssetResourceList {
	ArrayList<AudioRecording> audio_recording_list = new ArrayList<AudioRecording>();
	ImageList image_list;
	ArrayList<VideRecording> vide_recording_list = new ArrayList<VideRecording>();
	ArrayList<MovieRecording> movie_recording_list = new ArrayList<MovieRecording>();



	public ArrayList<AudioRecording> getAudioRecordingList() {
		return audio_recording_list;
	}

	public void setAudioRecordingList(ArrayList<AudioRecording> audioRecordingList) {
		audio_recording_list = audioRecordingList;
	}

	public ImageList getImageList() {
		return image_list;
	}

	public void setImageList(ImageList ImageListObject) {
		this.image_list = ImageListObject;
	}

	public ArrayList<VideRecording> getVideRecordingList() {
		return vide_recording_list;
	}

	public void setVideRecordingList(ArrayList<VideRecording> videRecordingList) {
		vide_recording_list = videRecordingList;
	}

	public ArrayList<MovieRecording> getMovieRecordingList() {
		return movie_recording_list;
	}

	public void setMovieRecordingList(ArrayList<MovieRecording> movieRecordingList) {
		movie_recording_list = movieRecordingList;
	}
}
