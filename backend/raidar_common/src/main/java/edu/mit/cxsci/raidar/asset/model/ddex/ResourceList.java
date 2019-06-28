package edu.mit.cxsci.raidar.asset.model.ddex;

import java.util.ArrayList;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class ResourceList {
	private ArrayList<SoundRecording> SoundRecording = new ArrayList<SoundRecording>();
	private Image Image;
	
	public ArrayList<SoundRecording> getSoundRecordingList() {
		return SoundRecording;
	}

	public void setSoundRecordingList(ArrayList<SoundRecording> soundRecordingList) {
		SoundRecording = soundRecordingList;
	}

	public Image getImageList() {
		return Image;
	}

	public void setImageList(Image ImageListObject) {
		this.Image = ImageListObject;
	}
}
