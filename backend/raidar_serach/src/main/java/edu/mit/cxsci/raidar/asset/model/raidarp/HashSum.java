package edu.mit.cxsci.raidar.asset.model.raidarp;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class HashSum {
	private HashSumText hash_sum_test;
	private HashAlg hash_sum_algorithm_type;



	public HashSumText getHashSum() {
		return hash_sum_test;
	}

	public HashAlg getHashSumAlgorithmType() {
		return hash_sum_algorithm_type;
	}



	public void setHashSum(HashSumText HashSum) {
		this.hash_sum_test = HashSum;
	}

	public void setHashSumAlgorithmType(HashAlg HashSumAlgorithmType) {
		this.hash_sum_algorithm_type = HashSumAlgorithmType;
	}
}
