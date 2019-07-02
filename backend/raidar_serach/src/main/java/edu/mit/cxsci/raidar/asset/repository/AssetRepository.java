package edu.mit.cxsci.raidar.asset.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.mit.cxsci.raidar.asset.model.raidarp.Asset;

public interface AssetRepository extends MongoRepository<Asset, Long> {

}