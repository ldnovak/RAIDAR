package edu.mit.cxsci.raidar.asset.model.raider;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class FileObj {
	public String getFileName() {
		return file_name;
	}
	public void setFileName(String fileName) {
		this.file_name = fileName;
	}
	public String getFilePath() {
		return file_path;
	}
	public void setFilePath(String filePath) {
		this.file_path = filePath;
	}
	public HashSum getHashSumObject() {
		return hash_sum;
	}
	public void setHashSumObject(HashSum hashSumObject) {
		this.hash_sum = hashSumObject;
	}
	private String file_name;
	private String file_path;
	private HashSum hash_sum;
}
