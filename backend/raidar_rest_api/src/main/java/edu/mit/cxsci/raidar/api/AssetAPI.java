package edu.mit.cxsci.raidar.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.mit.cxsci.raidar.asset.model.raidar.Asset;
import edu.mit.cxsci.raidar.asset.repository.AssetRepository;

import java.util.List;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

@RestController
@RequestMapping("/v1/api")
@CrossOrigin("*")
public class AssetAPI {

    @Autowired
    AssetRepository assetRepository;

    @GetMapping("/assets")
    public List<Asset> getAllAssets() {
        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        return assetRepository.findAll(sortByCreatedAtDesc);
    }

    @PostMapping("/assets")
    public Asset createAsset(@Valid @RequestBody Asset asset) {
        return assetRepository.save(asset);
    }

    @GetMapping(value="/assets/{id}")
    public ResponseEntity<Asset> getAssetById(@PathVariable("id") String id) {
        return assetRepository.findById(id)
                .map(asset -> ResponseEntity.ok().body(asset))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value="/assets/{id}")
    public ResponseEntity<Asset> updateAsset(@PathVariable("id") String id,
                                           @Valid @RequestBody Asset asset) {
        return assetRepository.findById(id)
                .map(assetData -> {
                	//TODO
                    Asset updatedAsset = assetRepository.save(assetData);
                    return ResponseEntity.ok().body(updatedAsset);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value="/assets/{id}")
    public ResponseEntity<?> deleteAsset(@PathVariable("id") String id) {
        return assetRepository.findById(id)
                .map(asset -> {
                    assetRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}