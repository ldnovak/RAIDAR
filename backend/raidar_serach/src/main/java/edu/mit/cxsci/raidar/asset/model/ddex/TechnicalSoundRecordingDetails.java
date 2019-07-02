package edu.mit.cxsci.raidar.asset.model.ddex;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/


public class TechnicalSoundRecordingDetails {
	private String TechnicalResourceDetailsReference;
	private String AudioCodecType;
	private String IsPreview;
	PreviewDetails PreviewDetailsObject;
	File FileObject;

	public String getTechnicalResourceDetailsReference() {
		return TechnicalResourceDetailsReference;
	}

	public String getAudioCodecType() {
		return AudioCodecType;
	}

	public String getIsPreview() {
		return IsPreview;
	}

	public PreviewDetails getPreviewDetails() {
		return PreviewDetailsObject;
	}

	public File getFile() {
		return FileObject;
	}

	public void setTechnicalResourceDetailsReference(String TechnicalResourceDetailsReference) {
		this.TechnicalResourceDetailsReference = TechnicalResourceDetailsReference;
	}

	public void setAudioCodecType(String AudioCodecType) {
		this.AudioCodecType = AudioCodecType;
	}

	public void setIsPreview(String IsPreview) {
		this.IsPreview = IsPreview;
	}

	public void setPreviewDetails(PreviewDetails PreviewDetailsObject) {
		this.PreviewDetailsObject = PreviewDetailsObject;
	}

	public void setFile(File FileObject) {
		this.FileObject = FileObject;
	}
}
