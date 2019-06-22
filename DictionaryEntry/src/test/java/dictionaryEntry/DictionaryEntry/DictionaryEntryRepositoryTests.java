//package dictionaryEntry.DictionaryEntry;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.bson.types.ObjectId;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class DictionaryEntryRepositoryTests {
//	
//	@Autowired
//	private DictionaryEntryRepository repository;
//	ObjectId id1;
//	ObjectId id2;
//	ObjectId id3;
//	DictionaryEntry entry1;
//	DictionaryEntry entry2;
//	DictionaryEntry entry3;
//	
//	@Before
//	public void setup() throws Exception{
//		ObjectId id1 = new ObjectId().get();
//		String key1 = "Alice";
//		List<String> values1 = new ArrayList<>();
//		DictionaryEntry entry1 = new DictionaryEntry(id1, key1, values1);
//		ObjectId id2 = new ObjectId().get();
//		String key2 = "Bob";
//		List<String> values2 = new ArrayList<>();
//		values2.add("Ding");
//		values2.add("Dong");
//		DictionaryEntry entry2 = new DictionaryEntry(id2, key2, values2);
//		ObjectId id3 = new ObjectId().get();
//		String key3 = "Bob";
//		List<String> values3 = new ArrayList<>();
//		values3.add("I");
//		values3.add("Like");
//		values3.add("Peanutbutter");
//		DictionaryEntry entry3 = new DictionaryEntry(id3, key3, values3);
//		this.repository.save(entry1);
//		this.repository.save(entry2);
//		this.repository.save(entry3);
//	}
//	
//	@Test
//	public void testGetMethods() {
//		
////		DictionaryEntry testEntry1 = this.repository.findById(id1);
////		DictionaryEntry testEntry2 = this.repository.findById(id2);
////		DictionaryEntry testEntry3 = this.repository.findById(id3);
////		assertEquals("Entry 1 is not the same", entry1, testEntry1);
////		assertEquals("Entry 2 is not the same", entry2, testEntry2);
////		assertEquals("Entry 3 is not the same", entry3, testEntry3);	
//	}
//	
////	@After
////	public void tearDown() throws Exception {
////		this.repository.deleteAll();
////	}
////	
//
//}
