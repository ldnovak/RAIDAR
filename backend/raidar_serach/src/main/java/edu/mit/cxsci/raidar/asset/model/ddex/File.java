package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class File {
	private String FileName;
	private String FilePath;
	HashSum HashSumObject;

	public String getFileName() {
		return FileName;
	}

	public String getFilePath() {
		return FilePath;
	}

	public HashSum getHashSum() {
		return HashSumObject;
	}

	public void setFileName(String FileName) {
		this.FileName = FileName;
	}

	public void setFilePath(String FilePath) {
		this.FilePath = FilePath;
	}

	public void setHashSum(HashSum HashSumObject) {
		this.HashSumObject = HashSumObject;
	}
}
