package edu.mit.cxsci.raidar.data.converter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.mit.cxsci.raidar.asset.model.marc.*;
import edu.mit.cxsci.raidar.asset.model.raidar.*;
import edu.mit.cxsci.raidar.util.Utilities;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/
public class MarcToRaidar {
	public static void main(String[] args) throws IOException {
		MarcToRaidar obj=new MarcToRaidar();
		Record record=obj.FromJsonToModel();
		Raidar asset=obj.buildRaiderAsset(record);
	}
	
	private Record FromJsonToModel() {
		String jsonString=Utilities.getInstance().loadJSONTest("data/marc.json");
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();
		
		Record record = new Record();
		record = gson.fromJson(jsonString, Record.class);
		jsonString = gson.toJson(record);
		System.out.println(jsonString);
		return record;
	}
	
	private Raidar buildRaiderAsset(Record record) {
		Raidar asset = new Raidar();
		ArrayList<ControlField> controlfields =record.getControlfield();
		RaidarHeaderInfo assetHeaderInfo = new RaidarHeaderInfo();
		assetHeaderInfo.setControlNumber("ControlID");
		assetHeaderInfo.setCopyright("Copyright");
		assetHeaderInfo.setControlNumberIdentifier("SASDSDASDDSDSA");
		assetHeaderInfo.setLeader("LEADER");
		assetHeaderInfo.setReceiver("Receiver");
		assetHeaderInfo.setSender("Sender");
		assetHeaderInfo.setAssetSubTitle("SubTitle");
		assetHeaderInfo.setAssetTitle("Title");
		assetHeaderInfo.setToken("Token");
		asset.setAssetHeaderInfo(assetHeaderInfo);

//		AssetResourceList assetResourceList = new AssetResourceList();
//		AudioRecording audioRecording = new AudioRecording();
//		audioRecording.setRecordingDate(new Date());
//		audioRecording.setTitleOfTrack("Title Of Track");
//		DisplayArtist displayArtist = new DisplayArtist();
//		displayArtist.getArtistRoles().add("some role");
//
//		ContactInfo contactInfo = new ContactInfo();
//		contactInfo.setAddress("232 Harvard, Boston, MA-02126");
//		contactInfo.setEmail("mizanul.chowdhury@gmail.com");
//		displayArtist.getContactInfos().add(contactInfo);
//
//		Identity identity = new Identity();
//		identity.setIdp("google");
//		identity.setName("Mizanul Chowdhury");
//		identity.setUserName("mizanul.chowdhury@gmail.com");
//		identity.setId("BERKLEEID232323");
//		displayArtist.getFullNames().add(identity);
//
//		displayArtist.setEthnicity("asian");
//		displayArtist.setGender("M");
//		displayArtist.setGenre("classical");
//		displayArtist.getGroupName().add("BBAGED");
//		displayArtist.getReferences().add("some reff");
//		displayArtist.setRecordingRight("Copy right 2019");
//		displayArtist.setLabelName("some labelName");
//		displayArtist.setLyrics("erewrererfdnjfkjeiofrjoiefksndkljlijeirjwkndjklasiojdilknewkldn");
//
//		AudioTechnicalDetail audioTechnicalDetail = new AudioTechnicalDetail();
//		audioTechnicalDetail.setIsPreview(true);
//		audioTechnicalDetail.setAudioCodecType("HSEM");
//		FileObj fileObject = new FileObj();
//		fileObject.setFileName("O Duniya Ke Rakh Wale");
//		fileObject.setFilePath("http://some-domain/rest/o_duniya_ke_rakh_waLe.mp4");
//		HashSum hashSumObject = new HashSum();
//		hashSumObject.setHashSum("HashSum");
//		hashSumObject.setHashSumAlgorithmType("HashSumAlgorithmTyp");
//		fileObject.setHashSumObject(hashSumObject);
//
//		PreviewDetails previewDetails = new PreviewDetails();
//		previewDetails.setExpressionType("some expressionType");
//		previewDetails.setStartPoint("some startPoint");
//
//		audioTechnicalDetail.setPreviewDetailsObject(previewDetails);
//		audioTechnicalDetail.setTechnicalResourceDetailsReference("technicalResourceDetailsReference");
//
//		audioTechnicalDetail.setFileObject(fileObject);
//		displayArtist.setAudioTechnicalDetailObject(audioTechnicalDetail);
//
//		audioRecording.setDisplayArtistObject(displayArtist);
//		assetResourceList.getAudioRecordingList().add(audioRecording);
//		ImageList imageList = new ImageList();
//		imageList.setImageId("some image Id");
//		imageList.setImageType("some image Type");
//		ImageDetailsByTerritory imageDetailsByTerritoryObject = new ImageDetailsByTerritory();
//		imageDetailsByTerritoryObject.setImageDetailsByTerritory("ImageDetailsByTerritory");
//		imageDetailsByTerritoryObject.setImageId("ImageId");
//		imageDetailsByTerritoryObject.setTerritoryCode("TerritoryCode");
//		imageList.setImageDetailsByTerritory(imageDetailsByTerritoryObject);
//		assetResourceList.setImageList(imageList);
//		asset.setAssetResourceList(assetResourceList);
//
//		VideRecording videRecordingList = new VideRecording();
//		assetResourceList.getVideRecordingList().add(videRecordingList);
//
//		MovieRecording movieRecordingList = new MovieRecording();
//		assetResourceList.getMovieRecordingList().add(movieRecordingList);
//
//		Release release = new Release();
//		CLine cLineObject = new CLine();
//		release.setCLine(cLineObject);
//
//		ReleaseList releaseList = new ReleaseList();
//		releaseList.getRelease().add(release);
//		asset.setReleaseList(releaseList);
//
//		DealList dealList = new DealList();
//		dealList.getRelease().add(new ReleaseDeal());
//		asset.setDealList(dealList);

		return asset;
	}
}
