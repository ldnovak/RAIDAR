package edu.mit.cxsci.raidar.asset.model.marc;

import java.io.File;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class MainApp {

	public static void main(String[] args)  throws IOException {
		MainApp main = new MainApp();
		File file = main.getFileFromResources("data/marc.json");
		//main.printFile(file);
		String jsonString=main.loadJSONTest("data/marc.json");
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Record record = new Record();

		Gson gson = builder.create();
		//record = gson.fromJson(jsonString, Record.class);
		//System.out.println(record);

		ControlField cf = new ControlField();
		cf.setTag("100");
		cf.setValue("MIZAN");
		record.getControlfield().add(cf);
		cf = new ControlField();
		cf.setTag("300");
		cf.setValue("JASMIZAN");
		record.getControlfield().add(cf);

		DataField df = new DataField();
		df.setTag("700");
		df.setInd1("a");
		df.setInd2("a2");
		df.setValue("MIZAN");
		SubField sf = new SubField();
		sf.setCode("10000");
		sf.setValue("SADASDASDASDASDDFEWFW");
		df.getSubfield().add(sf);
		record.getDatafield().add(df);

		jsonString = gson.toJson(record);
		System.out.println(jsonString);

	}

	private File getFileFromResources(String fileName) {

		ClassLoader classLoader = getClass().getClassLoader();

		URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file is not found!");
		} else {
			return new File(resource.getFile());
		}

	}
	private String loadJSONTest(String path) {
		String result =null;
        ClassLoader classLoader = getClass().getClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream(path)) {

            result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            //System.out.println(result);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

	  private void printFile(File file) throws IOException {

	        if (file == null) return;

	        try (FileReader reader = new FileReader(file);
	             BufferedReader br = new BufferedReader(reader)) {

	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        }
	    }

}
