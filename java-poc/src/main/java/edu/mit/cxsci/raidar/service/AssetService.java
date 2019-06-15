package edu.mit.cxsci.raidar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mit.cxsci.raidar.asset.model.raider.Asset;
import edu.mit.cxsci.raidar.asset.repository.AssetRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AssetService {
	private final AssetRepository productRespository;

	@Autowired
	public AssetService(AssetRepository productRespository) {
		this.productRespository = productRespository;
	}

	public List<Asset> findAll() {
		return productRespository.findAll();
	}

	public Asset findById(Long id) {
		return productRespository.findOne(id);
	}

	public Asset save(Asset stock) {
		return productRespository.save(stock);
	}

	public void deleteById(Long id) {
		productRespository.delete(id);
	}
}
