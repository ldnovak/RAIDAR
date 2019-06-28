package edu.mit.cxsci.raidar.asset.model.raidar;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class HashSum {
	private String hash_sum;
	private String hash_sum_algorithm_type;



	public String getHashSum() {
		return hash_sum;
	}

	public String getHashSumAlgorithmType() {
		return hash_sum_algorithm_type;
	}



	public void setHashSum(String HashSum) {
		this.hash_sum = HashSum;
	}

	public void setHashSumAlgorithmType(String HashSumAlgorithmType) {
		this.hash_sum_algorithm_type = HashSumAlgorithmType;
	}
}
