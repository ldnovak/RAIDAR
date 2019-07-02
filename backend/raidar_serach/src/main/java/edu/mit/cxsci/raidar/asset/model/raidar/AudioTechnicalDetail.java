package edu.mit.cxsci.raidar.asset.model.raidar;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class AudioTechnicalDetail {
	private String technical_resource_details_reference;
	private String audio_codec_type;
	private boolean is_preview;
	private PreviewDetails preview_details;
	private FileObj file_object;

	public String getTechnicalResourceDetailsReference() {
		return technical_resource_details_reference;
	}
	public void setTechnicalResourceDetailsReference(String technicalResourceDetailsReference) {
		this.technical_resource_details_reference = technicalResourceDetailsReference;
	}
	public String getAudioCodecType() {
		return audio_codec_type;
	}
	public void setAudioCodecType(String audioCodecType) {
		this.audio_codec_type = audioCodecType;
	}
	public boolean getIsPreview() {
		return is_preview;
	}
	public void setIsPreview(boolean isPreview) {
		this.is_preview = isPreview;
	}
	public PreviewDetails getPreviewDetailsObject() {
		return preview_details;
	}
	public void setPreviewDetailsObject(PreviewDetails previewDetailsObject) {
		this.preview_details = previewDetailsObject;
	}
	public FileObj getFileObject() {
		return file_object;
	}
	public void setFileObject(FileObj fileObject) {
		this.file_object = fileObject;
	}




}
