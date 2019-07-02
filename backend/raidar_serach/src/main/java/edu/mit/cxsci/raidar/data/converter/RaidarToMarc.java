package edu.mit.cxsci.raidar.data.converter;

import java.io.IOException;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

import edu.mit.cxsci.raidar.asset.model.marc.*;
import edu.mit.cxsci.raidar.asset.model.raidar.*;
import edu.mit.cxsci.raidar.util.Utilities;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class RaidarToMarc {
	public static void main(String[] args) {
		RaidarToMarc app = new RaidarToMarc();
		app.createMarc();
	}

	private ArrayList<String> getList(Class clazz, Object object) {
		String cvsSplitBy = ",";
		ArrayList<String> list = new ArrayList<String>();
		Field[] fields = clazz.getDeclaredFields();
		// Method[] methods = clazz.getMethods();
		// for (Method method : methods) {
		// System.out.println(method.getName());
		// }
		for (Field field : fields) {
			System.out.println(field.getName());
			String fieldName = field.getName();
			String key = Utilities.getInstance().FindMarcKey(fieldName);
			System.out.println("key===="+key);
			if (key != null && key != "") {
				
				String tag = key.split(cvsSplitBy, 4)[0];
				String ind1 = key.split(cvsSplitBy, 4)[1];
				String ind2 = key.split(cvsSplitBy, 4)[2];
				String code = key.split(cvsSplitBy, 4)[3];

//				System.out.println("tag====" + tag);
//				System.out.println("ind1====" + ind1);
//				System.out.println("ind2====" + ind2);
//				System.out.println("code====" + code);
				PropertyDescriptor pd;
				try {
					System.out.println("======field.getType()=====" + field.getType().getName());
					if (field.getType().equals(Boolean.class)) {
						
					} 
					pd = new PropertyDescriptor(field.getName(), clazz);

					String value = "";
					try {
						if (pd.getReadMethod().invoke(object) != null && tag != "") {
							value = pd.getReadMethod().invoke(object).toString();
							// System.out.println("===========" + value);
							list.add(key + "," + value);
						}

					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (IntrospectionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	private Asset FromJsonToModel() {
		String jsonString = Utilities.getInstance().loadJSONTest("data/raidar_data.json");
		// System.out.println(jsonString);
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Asset asset = new Asset();
		Gson gson = builder.create();

		asset = gson.fromJson(jsonString, Asset.class);

		return asset;
	}

	private void createMarc() {
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Asset asset = FromJsonToModel();
		Gson gson = builder.create();
		// System.out.println(asset);
		String jsonString2 = gson.toJson(asset);
		// System.out.println(asset.getAssetHeaderInfo().getReceiver().getData());
		Class clazz =null;
		MarcCollection marcCollection = new MarcCollection();

		Record record = new Record();

		AssetHeaderInfo object = asset.getAssetHeaderInfo();
		clazz = object.getClass();
		String cvsSplitBy = ",";

		ArrayList<String> ls = getList(clazz, object);
		for (String l : ls) {
			ControlField cf = new ControlField();
			cf.setTag(l.split(cvsSplitBy)[0]);
			cf.setValue(l.split(cvsSplitBy)[4]);
			record.getControlfield().add(cf);
		}

	
		AssetResourceList assetResourceList = asset.getAssetResourceList();
		ArrayList<AudioRecording> audioRecordingList = assetResourceList.getAudioRecordingList();
		for (AudioRecording audioRecording : audioRecordingList) {
			clazz = audioRecording.getClass();
			ArrayList<String> ls2 = getList(clazz, audioRecording);
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

			marcCollection.setRecord(record);

		}

		String jsonString = gson.toJson(marcCollection);
		System.out.println(jsonString);
	}
}
