package edu.mit.cxsci.raidar.asset.model.raidarp;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class FileObj {
	public FileName getFileName() {
		return file_name;
	}
	public void setFileName(FileName fileName) {
		this.file_name = fileName;
	}
	public FilePath getFilePath() {
		return file_path;
	}
	public void setFilePath(FilePath filePath) {
		this.file_path = filePath;
	}
	public HashSum getHashSumObject() {
		return hash_sum;
	}
	public void setHashSumObject(HashSum hashSumObject) {
		this.hash_sum = hashSumObject;
	}
	private FileName file_name;
	private FilePath file_path;
	private HashSum hash_sum;
}
