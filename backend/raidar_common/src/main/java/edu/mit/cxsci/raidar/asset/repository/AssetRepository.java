package edu.mit.cxsci.raidar.asset.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.mit.cxsci.raidar.asset.model.raidar.Asset;

/**
 * @author Mizanul Chowdhury
 */
@Repository
public interface AssetRepository extends MongoRepository<Asset, String> {

}