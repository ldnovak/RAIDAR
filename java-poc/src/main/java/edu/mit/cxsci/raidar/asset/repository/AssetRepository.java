package edu.mit.cxsci.raidar.asset.repository;

import edu.mit.cxsci.raidar.asset.model.AbstractAsset;
import edu.mit.cxsci.raidar.asset.model.Asset;
import edu.mit.cxsci.raidar.asset.model.BaseAsset;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author srmoore
 */
public interface AssetRepository extends MongoRepository<BaseAsset, String> {

	/**
	 * Add an {@link Asset} to the Repository
	 *
	 * @param assetToAdd	Asset to add to the repository (times and ID will be updated by this operation)
	 * @return 				Asset as stored in the repository (with ID, etc.)
	 */
	Asset addAsset(Asset assetToAdd);

	/**
	 * Get an {@link Asset} by ID
	 * @param id	ID of the asset to retrieve
	 * @return		Asset
	 */
	Asset getAsset(String id);

	/**
	 * Update an {@link Asset} in the repository
	 * @param assetToUpdate	Updated version of an asset. Must have ID
	 * @return				Updated version of the asset as stored
	 */
	Asset updateAsset(Asset assetToUpdate);

	/**
	 * Remove an {@link Asset} from the repository
	 * @param assetToRemove
	 */
	void removeAsset(Asset assetToRemove);
}
