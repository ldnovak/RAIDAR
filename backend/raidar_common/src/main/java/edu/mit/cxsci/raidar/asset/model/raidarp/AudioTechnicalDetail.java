package edu.mit.cxsci.raidar.asset.model.raidarp;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class AudioTechnicalDetail {
	private TechnicalResourceDetailRef technical_resource_details_reference;
	private AudioCodecType audio_codec_type;
	private boolean is_preview;
	private PreviewDetails preview_details;
	private FileObj file_object;

	public TechnicalResourceDetailRef getTechnicalResourceDetailsReference() {
		return technical_resource_details_reference;
	}
	public void setTechnicalResourceDetailsReference(TechnicalResourceDetailRef technicalResourceDetailsReference) {
		this.technical_resource_details_reference = technicalResourceDetailsReference;
	}
	public AudioCodecType getAudioCodecType() {
		return audio_codec_type;
	}
	public void setAudioCodecType(AudioCodecType audioCodecType) {
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
