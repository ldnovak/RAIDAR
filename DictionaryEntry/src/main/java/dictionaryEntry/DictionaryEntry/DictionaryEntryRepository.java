package dictionaryEntry.DictionaryEntry;

//https://stackoverflow.com/questions/43026358/spring-boot-application-in-eclipse-the-tomcat-connector-configured-to-listen-on

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import org.bson.types.ObjectId;

@Repository
public interface DictionaryEntryRepository extends MongoRepository<DictionaryEntry, String>{
	DictionaryEntry findById(ObjectId id);
	List<DictionaryEntry> findByKey(String key);
	//test
}
