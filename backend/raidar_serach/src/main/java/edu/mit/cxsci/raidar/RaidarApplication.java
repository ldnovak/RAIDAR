package edu.mit.cxsci.raidar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class RaidarApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(RaidarApplication.class, args);
	}
}
