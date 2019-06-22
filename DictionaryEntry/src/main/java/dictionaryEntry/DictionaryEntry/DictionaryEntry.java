package dictionaryEntry.DictionaryEntry;

import java.util.List;
import java.util.ArrayList; //need to figure out if linkedList is better and syncronized
import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;




/**
 * A dictionary entry object where with immutable name and key look ups
 * and mutable list of elements.
 *
 *
 *Note can use @Ducument from org.springframework.data.mongodb.core.mapping
 * if want to change name of DictionaryEntry in db -- don't know if I have package
 *   https://docs.spring.io/spring-data/data-mongodb/docs/current/api/org/springframework/data/mongodb/core/mapping/Document.html
 */

public class DictionaryEntry {
	
//	private final boolean debug = false;

	@Id
	private ObjectId id;
	
	private final String key;
	private List<String> valueList;
	
	/**
	 * Abstraction 
	 * 	Entry(id, key, valueList) represents an entry to a dictionary with
	 * 	a projects id, the name of the artist key,and a information 
	 * 	important about that artist and their song valueList
	 * 
	 * Rep Invariant
	 * 	key is not null
	 * 
	 * Safety from rep exposure 
	 * 	name and key are private and immutable
	 * 	valueList is private
	 * 
	 * @param id - identifier of song or project -- right now is OjbectId type to make it easy to make new IDs at random
	 * 		if IDs need to be from pattern need to make sequence counter
	 * 		users cannot make IDs bc now creator for ObjectId (I think need to test)
	 * 		if we want this to be possible can make creator with new ObjectId(String s) to turn String to ObjectId
	 * @param key - name of specific song or project
	 * @param valueList - list of values about song -- need to check json reader reads list weel
	 */
	
	
	/**
	 * Creates a new DictionaryEntry
	 * @param id - id of song or project
	 * @param key - name of artist  
	 */
//	public DictionaryEntry(ObjectId id, String key) {
//		this.id = id;
//		this.key = key;
//		if (debug) {this.checkRep();}
//	}
	
	/**
	 * Creates a new DictionaryEntry
	 * @param id - id of song or project
	 * @param key - name of artist  
	 * @param values - Value list to add
	 */
	public DictionaryEntry(ObjectId id, String key, List<String> valueList) {
		this.id = id;
		this.key = key;
		this.valueList = valueList;
//		if (debug) {this.checkRep();}
	}
	
	
	/**
	 * asserts the rep invariant
	 * 
	 * Really silly for what it is rn as checks final private variables
	 */
	private void checkRep() {
		//assert this.id != null;
		assert this.key != null;
	}
	
	/**
	 * 
	 * @return id of Entry
	 */
	public String getId() {
		return this.id.toHexString();
	}
	
	/**
	 * 
	 * @param id - id to set DictionaryEntry to
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return key of entry
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * 
	 * @return valueList of entry
	 */
	public List<String> getValueList(){
		return this.valueList;
	}
	
	/**
	 * Add value to valueList
	 * 
	 * @param value to be added to valueList
	 * @return true if valueList changed
	 */
	public boolean addValue(String value) {
		return this.valueList.add(value);
	}
	
	/**
	 * adds list of values to valueList
	 * 
	 * @param valueList a list of values
	 * @return true if valueList changed
	 */
	public boolean addAllValue(List<String> valueList) {
		return this.valueList.addAll(valueList);
	}
	
	/**
	 * removes a value if it exists in valueList
	 * 	does nothing if value is not in valueList
	 * 
	 * @param value to try to remove
	 * @return true if valueList was changed
	 */
	public boolean removeValue(String value) {
		return this.valueList.remove(value);
	}
	
	/**
	 * removes all values in a list from valueList (if the values exist)
	 * 	 does nothing if no of the values in list are in valueList
	 * 
	 * @param valueList list of values to attempt to remove
	 * @return true if valueList was changed
	 */
	public boolean removeAllValue(List<String> valueList) {
		return this.valueList.removeAll(valueList);
	}
	
	/**
	 * retains only the values from valueList that exist in inputed list
	 * 	-- i.e., deletes all elements from valueList that aren't in input list 
	 * 
	 * @param valueList of elements to retain
	 * @return true if valueList is changed
	 */
	public boolean retainAllValue(List<String> valueList) {
		return this.valueList.retainAll(valueList);
	}
	
	/**
	 * Replaces valueList with a new list
	 * 
	 * @param valueList to replace with
	 * @return true if valueList was changed
	 */
	public boolean replaceAllValues(List<String> valueList) {
		if (this.valueList.equals(valueList)) {return false;}
		this.valueList = valueList;
		return true;
	}
	
	/**
	 * replaces valueList with an empty list
	 * 
	 * @return true if valueList was changed
	 */
	public boolean emptyValues() {
		if (this.valueList.isEmpty()) {return false;}
		this.valueList = new ArrayList<>();
		return true;
	}
	
	/**
	 * checks if tow objects are equal
	 * 	they are equal iff the ids, keys, and all values are the same in the same order -- may be worth changing
	 */
	@Override 
	public boolean equals(Object that) {
		if(!(that instanceof DictionaryEntry)) {return false;}
		DictionaryEntry thatEntry = (DictionaryEntry) that;
		return this.getId().equals(thatEntry.getId()) && this.key.equals(thatEntry.getKey())
				&& this.valueList.equals(thatEntry.getValueList());
	}
	
	@Override
	public String toString() {
		return String.format("DictEntry[id:%s, key:%s, values:%s]",
				this.id, this.key, this.valueList.toString());
	}
	
}
