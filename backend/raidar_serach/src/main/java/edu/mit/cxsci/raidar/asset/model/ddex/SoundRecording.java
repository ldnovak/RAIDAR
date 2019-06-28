package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class SoundRecording {
	private String SoundRecordingType;
	SoundRecordingId SoundRecordingIdObject;
	private String ResourceReference;
	ReferenceTitle ReferenceTitleObject;
	private String Duration;
	SoundRecordingDetailsByTerritory SoundRecordingDetailsByTerritoryObject;

	public String getSoundRecordingType() {
		return SoundRecordingType;
	}

	public SoundRecordingId getSoundRecordingId() {
		return SoundRecordingIdObject;
	}

	public String getResourceReference() {
		return ResourceReference;
	}

	public ReferenceTitle getReferenceTitle() {
		return ReferenceTitleObject;
	}

	public String getDuration() {
		return Duration;
	}

	public SoundRecordingDetailsByTerritory getSoundRecordingDetailsByTerritory() {
		return SoundRecordingDetailsByTerritoryObject;
	}

	public void setSoundRecordingType(String SoundRecordingType) {
		this.SoundRecordingType = SoundRecordingType;
	}

	public void setSoundRecordingId(SoundRecordingId SoundRecordingIdObject) {
		this.SoundRecordingIdObject = SoundRecordingIdObject;
	}

	public void setResourceReference(String ResourceReference) {
		this.ResourceReference = ResourceReference;
	}

	public void setReferenceTitle(ReferenceTitle ReferenceTitleObject) {
		this.ReferenceTitleObject = ReferenceTitleObject;
	}

	public void setDuration(String Duration) {
		this.Duration = Duration;
	}

	public void setSoundRecordingDetailsByTerritory(
			SoundRecordingDetailsByTerritory SoundRecordingDetailsByTerritoryObject) {
		this.SoundRecordingDetailsByTerritoryObject = SoundRecordingDetailsByTerritoryObject;
	}
}