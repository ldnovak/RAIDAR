package dictionaryEntry.DictionaryEntry;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DictionaryEntryTests {
	
	/*
	 * Testing Strategy 
	 * 
	 * TODO if necessary
	 */
	@Test
	public void testMakeDictionaryEntryEmptyValues() {
		ObjectId id = new ObjectId().get();
		String key = "Alice";
		List<String> values = new ArrayList<>();
		DictionaryEntry entry = new DictionaryEntry(id, key, values);
		assertEquals("Expected correct ID", id.toString(), entry.getId());
		assertEquals("Expected correct key", "Alice", entry.getKey());
		assertEquals("Expected no values", new ArrayList<String>(), entry.getValueList());
		
	}
	
	@Test
	public void testMakeDictionaryEntryValues() {
		ObjectId id = new ObjectId().get();
		String key = "Alice";
		List<String> values = new ArrayList<>();
		values.add("hi");
		values.add("there");
		values.add("you");
		DictionaryEntry entry = new DictionaryEntry(id, key, values);
		assertEquals("Expected correct ID", id.toString(), entry.getId());
		assertEquals("Expected correct key", "Alice", entry.getKey());
		assertEquals("Expected correct values", values, entry.getValueList());	
	}
	
	@Test
	public void testAddingValues() {
		ObjectId id = new ObjectId().get();
		String key = "Bob";
		List<String> values = new ArrayList<>();
		DictionaryEntry entry = new DictionaryEntry(id, key, values);
		entry.addValue("Yo");
		values.add("Yo");
		assertEquals("Expected correct ID", id.toString(), entry.getId());
		assertEquals("Expected correct key", "Bob", entry.getKey());
		assertEquals("Expected correct values", values, entry.getValueList());
		List<String> newValues = new ArrayList<>();
		newValues.add("I");
		newValues.add("don't like");
		newValues.add("tests");
		entry.addAllValue(newValues);
		values.addAll(newValues);
		assertEquals("Expected correct ID", id.toString(), entry.getId());
		assertEquals("Expected correct key", "Bob", entry.getKey());
		assertEquals("Expected correct values", values, entry.getValueList());
	}
	
	@Test
	public void testRemoveValues() {
		ObjectId id = new ObjectId().get();
		String key = "Carol";
		List<String> values = new ArrayList<>();
		values.add("Y");
		values.add("M");
		values.add("C");
		values.add("A");
		DictionaryEntry entry = new DictionaryEntry(id, key, values);
		assertEquals("Expected correct ID", id.toString(), entry.getId());
		assertEquals("Expected correct key", "Carol", entry.getKey());
		assertEquals("Expected correct values", values, entry.getValueList());
		entry.removeValue("M");
		values.remove("M");
		assertEquals("Expected correct ID", id.toString(), entry.getId());
		assertEquals("Expected correct key", "Carol", entry.getKey());
		assertEquals("Expected correct values", values, entry.getValueList());
		List<String> removeValues = values;
		values.remove("Y");
		values.remove("A");
		removeValues.removeAll(values);
		entry.removeAllValue(removeValues);
		assertEquals("Expected correct ID", id.toString(), entry.getId());
		assertEquals("Expected correct key", "Carol", entry.getKey());
		assertEquals("Expected correct values", values, entry.getValueList());		
	}
	
	@Test
	public void testRetainValues() {
		ObjectId id = new ObjectId().get();
		String key = "David";
		List<String> values = new ArrayList<>();
		values.add("Words");
		values.add("Are");
		values.add("fun");
		values.add("Right Guys");
		DictionaryEntry entry = new DictionaryEntry(id, key, values);
		assertEquals("Expected correct ID", id.toString(), entry.getId());
		assertEquals("Expected correct key", "David", entry.getKey());
		assertEquals("Expected correct values", values, entry.getValueList());
		List<String> retainValues = values;
		retainValues.add("Right Guys");
		entry.retainAllValue(retainValues);
		assertEquals("Expected correct ID", id.toString(), entry.getId());
		assertEquals("Expected correct key", "David", entry.getKey());
		assertEquals("Expected correct values", retainValues, entry.getValueList());		
	}

}