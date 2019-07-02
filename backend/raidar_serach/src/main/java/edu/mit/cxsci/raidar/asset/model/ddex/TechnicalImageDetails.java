package edu.mit.cxsci.raidar.asset.model.ddex;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/


public class TechnicalImageDetails {
	private String TechnicalResourceDetailsReference;
	private String ImageCodecType;
	File FileObject;

	public String getTechnicalResourceDetailsReference() {
		return TechnicalResourceDetailsReference;
	}

	public String getImageCodecType() {
		return ImageCodecType;
	}

	public File getFile() {
		return FileObject;
	}

	public void setTechnicalResourceDetailsReference(String TechnicalResourceDetailsReference) {
		this.TechnicalResourceDetailsReference = TechnicalResourceDetailsReference;
	}

	public void setImageCodecType(String ImageCodecType) {
		this.ImageCodecType = ImageCodecType;
	}

	public void setFile(File FileObject) {
		this.FileObject = FileObject;
	}
}
