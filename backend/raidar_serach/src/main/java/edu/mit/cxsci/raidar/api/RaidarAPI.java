package edu.mit.cxsci.raidar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import edu.mit.cxsci.raidar.asset.model.raidarp.Asset;
import edu.mit.cxsci.raidar.service.AssetService;

import java.util.List;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

@RestController
@RequestMapping("/api/v1/assets")
public class RaidarAPI {
	private final AssetService assetService;

	@Autowired
	public RaidarAPI(AssetService assetService) {
		this.assetService = assetService;
	}

	@GetMapping
	public ResponseEntity<List<Asset>> findAll() {
		return ResponseEntity.ok(assetService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Asset> findById(@PathVariable Long id) {
		Asset product = assetService.findById(id);
		return ResponseEntity.ok(product);
	}

	@PostMapping
	public ResponseEntity<Asset> create(Asset asset) {
		return ResponseEntity.status(HttpStatus.CREATED).body(assetService.save(asset));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Asset> update(@PathVariable Long id, @RequestBody Asset asset) {
		return ResponseEntity.accepted().body(assetService.save(asset));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		assetService.deleteById(id);
		return ResponseEntity.accepted().build();
	}
}
