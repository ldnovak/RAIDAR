package dictionaryEntry.DictionaryEntry;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;

import java.util.List;
import java.util.Arrays;


@RestController
@RequestMapping("/EntryDB")
public class DictionaryEntryController {
//	//@GetMapping("/dictionaryEntries")
//	public List<DictionaryEntry> getAllDictionaryEntries(){
//		return Arrays.asList(new DictionaryEntry("0", "Alice"),
//				new DictionaryEntry("1", "Bob", Arrays.asList("Hi", "There")));
//	}
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private final DictionaryEntryRepository entryRepository;

	public DictionaryEntryController(DictionaryEntryRepository entryRepository) {
		this.entryRepository = entryRepository;
	}
	
	/**
	 * 
	 * @return - all entries in DB
	 */
	//@GetMapping look into after basic build
	//https://www.baeldung.com/spring-new-requestmapping-shortcuts
//	@RequestMapping(value = "", method = RequestMethod.GET)
	@GetMapping("")
	public List<DictionaryEntry> getAllEntries(){
		this.LOG.info("Getting all entries");
		return this.entryRepository.findAll();
	}
	
	@RequestMapping(value = "/getId/{id}", method = RequestMethod.GET)
	public DictionaryEntry getEntryById(@PathVariable ("id") ObjectId id) {
		LOG.info("Getting entry with ID: {}", id.toHexString());
		return this.entryRepository.findById(id);
	}
	
	@RequestMapping(value = "/getKey/{key}", method = RequestMethod.GET)
	public List<DictionaryEntry> getEntryByKet(@PathVariable("key") String key){
		LOG.info("Getting entries with key: {}", key);
		return this.entryRepository.findByKey(key);
	}
	
	//need to test with and without value list
	//currently think it will work with or without bc two different creators but am unsure
	//also need to make sure no issue without adding id -- seems fine in tutorials
	//  depending on what this does it may or may not cause issues with lists (if not specified is valueList none?)
	//@RequestMapping(value = "/create", method = RequestMethod.POST)
//	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
	@PostMapping(path = "/create")
	public DictionaryEntry DictionaryEntryCreatePost(@RequestBody DictionaryEntry entry) {
//		return "HI";
		entry.setId(ObjectId.get());
		LOG.info("Added with POST DictionaryEntry: {}", entry);
		return this.entryRepository.save(entry);
	}
	
	@PutMapping(path = "/replace/{id}")
	public DictionaryEntry DictionaryEntryPut(@RequestBody DictionaryEntry entry, @PathVariable ("id") ObjectId id) {
		entry.setId(id);
		LOG.info("Added with PUTDictionaryEntry: {}", entry);
		return this.entryRepository.save(entry);
	}
	
	@PutMapping(path = "/add/{id}/{value}")
	public DictionaryEntry DictionaryEntryAddValue(@PathVariable("id") ObjectId id, @PathVariable("value") String value) {
		DictionaryEntry entry = this.getEntryById(id);
		entry.addValue(value);
		return this.entryRepository.save(entry);
	}
	
	@PutMapping(path = "/add/{id}")
	public DictionaryEntry DictionaryEntryAddValueList(@PathVariable("id") ObjectId id, @RequestBody DictionaryEntry entry) {
		DictionaryEntry saveEntry = this.getEntryById(id);
		saveEntry.addAllValue(entry.getValueList());
		return this.entryRepository.save(saveEntry);
	}
	
	@PutMapping(path = "/remove/{id}/{value}")
	public DictionaryEntry DictionaryEntryDeleteValue(@PathVariable("id") ObjectId id, @PathVariable("value") String value) {
		DictionaryEntry entry = this.getEntryById(id);
		entry.removeValue(value);
		return this.entryRepository.save(entry);
	}
	
	@PutMapping(path = "/remove/{id}")
	public DictionaryEntry DictionaryEntryDeleteValueList(@PathVariable("id") ObjectId id, @RequestBody DictionaryEntry entry) {
		DictionaryEntry saveEntry = this.getEntryById(id);
		saveEntry.removeAllValue(entry.getValueList());
		return this.entryRepository.save(saveEntry);
	}

	@PutMapping(path = "/retain/{id}")
	public DictionaryEntry DictionaryEntryRetainValueList(@PathVariable("id") ObjectId id, @RequestBody DictionaryEntry entry) {
		DictionaryEntry saveEntry = this.getEntryById(id);
		saveEntry.retainAllValue(entry.getValueList());
		return this.entryRepository.save(saveEntry);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteDictionaryEntry(@PathVariable("id") ObjectId id) {
		DictionaryEntry toDelete = this.entryRepository.findById(id);
		LOG.info("Deleted entry: {}", toDelete);
		this.entryRepository.delete(toDelete);
	}
	
		
}