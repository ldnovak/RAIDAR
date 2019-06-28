package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class HashSum {
	private String HashSum;
	private String HashSumAlgorithmType;

	public String getHashSum() {
		return HashSum;
	}

	public String getHashSumAlgorithmType() {
		return HashSumAlgorithmType;
	}

	public void setHashSum(String HashSum) {
		this.HashSum = HashSum;
	}

	public void setHashSumAlgorithmType(String HashSumAlgorithmType) {
		this.HashSumAlgorithmType = HashSumAlgorithmType;
	}
}