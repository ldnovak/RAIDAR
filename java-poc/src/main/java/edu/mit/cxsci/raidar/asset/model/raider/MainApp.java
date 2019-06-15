package edu.mit.cxsci.raidar.asset.model.raider;

import java.io.File;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.mit.cxsci.raidar.util.Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Hashtable;
import java.util.Set;

import org.apache.commons.io.IOUtils;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 * @since 2014-03-31
 **/

public class MainApp {

	public static void main(String[] args) throws IOException {
		MainApp main = new MainApp();
		// //File file = main.getFileFromResources("data/raidar_data.json");
		// Utilities.getInstance()Utilities.getInstance().printFile(file);
		String jsonString = Utilities.getInstance().loadJSONTest("data/raidar_data.json");
		// //System.out.println(jsonString);
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Asset asset = new Asset();
		Gson gson = builder.create();
		asset = gson.fromJson(jsonString, Asset.class);
		// System.out.println(asset);

		// jsonString = gson.toJson(main.buildTheObject());
		// System.out.println(jsonString);

		String jsonString2 = gson.toJson(main.buildTheObject());
		// System.out.println(jsonString2);

		Hashtable ht = Utilities.getInstance().ParseCsvData("data/marc_raidar.csv");
		Set<String> keys = ht.keySet();
		for(String key: keys){
			System.out.println("Value of "+key+" is: "+ht.get(key));
		}

	}

	private Asset buildTheObject() {
		Asset asset = new Asset();
		AssetHeaderInfo assetHeaderInfo = new AssetHeaderInfo();
		assetHeaderInfo.setControlID("ControlID");
		assetHeaderInfo.setCopyright("Copyright");
		assetHeaderInfo.setDate("Date");
		assetHeaderInfo.setID("SASDSDASDDSDSA");
		assetHeaderInfo.setLEADER("LEADER");
		assetHeaderInfo.setReceiver("Receiver");
		assetHeaderInfo.setSender("Sender");
		assetHeaderInfo.setSubTitle("SubTitle");
		assetHeaderInfo.setTitle("Title");
		assetHeaderInfo.setToken("Token");
		asset.setAssetHeaderInfo(assetHeaderInfo);

		AssetResourceList assetResourceList = new AssetResourceList();
		AudioRecording audioRecording = new AudioRecording();
		audioRecording.setRecordingDate(new Date());
		audioRecording.setTitleOfTrack("Title Of Track");
		DisplayArtist displayArtist = new DisplayArtist();
		displayArtist.getArtistRoles().add("some role");

		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setAddress("232 Harvard, Boston, MA-02126");
		contactInfo.setEmail("mizanul.chowdhury@gmail.com");
		displayArtist.getContactInfos().add(contactInfo);

		Identity identity = new Identity();
		identity.setIdp("google");
		identity.setName("Mizanul Chowdhury");
		identity.setUserName("mizanul.chowdhury@gmail.com");
		identity.setId("BERKLEEID232323");
		displayArtist.getFullNames().add(identity);

		displayArtist.setEthnicity("asian");
		displayArtist.setGender("M");
		displayArtist.setGenre("classical");
		displayArtist.getGroupName().add("BBAGED");
		displayArtist.getReferences().add("some reff");
		displayArtist.setRecordingRight("Copy right 2019");
		displayArtist.setLabelName("some labelName");
		displayArtist.setLyrics("erewrererfdnjfkjeiofrjoiefksndkljlijeirjwkndjklasiojdilknewkldn");

		AudioTechnicalDetail audioTechnicalDetail = new AudioTechnicalDetail();
		audioTechnicalDetail.setIsPreview(true);
		audioTechnicalDetail.setAudioCodecType("HSEM");
		FileObj fileObject = new FileObj();
		fileObject.setFileName("O Duniya Ke Rakh Wale");
		fileObject.setFilePath("http://some-domain/rest/o_duniya_ke_rakh_waLe.mp4");
		HashSum hashSumObject = new HashSum();
		hashSumObject.setHashSum("HashSum");
		hashSumObject.setHashSumAlgorithmType("HashSumAlgorithmTyp");
		fileObject.setHashSumObject(hashSumObject);

		PreviewDetails previewDetails = new PreviewDetails();
		previewDetails.setExpressionType("some expressionType");
		previewDetails.setStartPoint("some startPoint");

		audioTechnicalDetail.setPreviewDetailsObject(previewDetails);
		audioTechnicalDetail.setTechnicalResourceDetailsReference("technicalResourceDetailsReference");

		audioTechnicalDetail.setFileObject(fileObject);
		displayArtist.setAudioTechnicalDetailObject(audioTechnicalDetail);

		audioRecording.setDisplayArtistObject(displayArtist);
		assetResourceList.getAudioRecordingList().add(audioRecording);
		ImageList imageList = new ImageList();
		imageList.setImageId("some image Id");
		imageList.setImageType("some image Type");
		ImageDetailsByTerritory imageDetailsByTerritoryObject = new ImageDetailsByTerritory();
		imageDetailsByTerritoryObject.setImageDetailsByTerritory("ImageDetailsByTerritory");
		imageDetailsByTerritoryObject.setImageId("ImageId");
		imageDetailsByTerritoryObject.setTerritoryCode("TerritoryCode");
		imageList.setImageDetailsByTerritory(imageDetailsByTerritoryObject);
		assetResourceList.setImageList(imageList);
		asset.setAssetResourceList(assetResourceList);

		VideRecording videRecordingList = new VideRecording();
		assetResourceList.getVideRecordingList().add(videRecordingList);

		MovieRecording movieRecordingList = new MovieRecording();
		assetResourceList.getMovieRecordingList().add(movieRecordingList);

		Release release = new Release();
		CLine cLineObject = new CLine();
		release.setCLine(cLineObject);

		ReleaseList releaseList = new ReleaseList();
		releaseList.getRelease().add(release);
		asset.setReleaseList(releaseList);

		DealList dealList = new DealList();
		dealList.getRelease().add(new ReleaseDeal());
		asset.setDealList(dealList);

		return asset;
	}

}
