package edu.mit.cxsci.raidar.asset.model.raidarp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;
import edu.mit.cxsci.raidar.data.converter.MarcPointer;
import edu.mit.cxsci.raidar.data.converter.MarcPointerList;
import edu.mit.cxsci.raidar.util.Utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;

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
		//String jsonString = Utilities.getInstance().loadJSONTest("data/raidar_data.json");
		// //System.out.println(jsonString);
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Asset asset = new Asset();
		//builder.excludeFieldsWithoutExposeAnnotation();
		Gson gson = builder.create();
		
//		asset = gson.fromJson(jsonString, Asset.class);
		// System.out.println(asset);

		// jsonString = gson.toJson(main.buildTheObject());
		// System.out.println(jsonString);

		String jsonString2 = gson.toJson(main.buildTheObject());
		System.out.println(jsonString2);

		
		String jsonString = Utilities.getInstance().loadJSONTest("data/marc_raidar.json");
		//System.out.println(jsonString);
		
		MarcPointerList marcPointerList=new MarcPointerList();
		MarcPointer marcPointer=new MarcPointer();
		marcPointer.setCode("4444");
		marcPointer.setInd1("4");
		marcPointer.setInd2("5");
		marcPointer.setTag("001");
		marcPointer.setText("ControlNumbber");
		
		marcPointerList.getMarcPointer().add(marcPointer);
		String jsonString3 = gson.toJson(marcPointerList);
		//System.out.println(jsonString3);
	}

	private Asset buildTheObject() {
		
		Asset asset = new Asset();
		AssetHeaderInfo assetHeaderInfo = new AssetHeaderInfo();
		
		Leader leader=new Leader();
		leader.setData("sadsads ddsdsaddew 34343");
		assetHeaderInfo.setLeader(leader);
		
		ControlNumber contnum=new ControlNumber();
//		Field[] fields = assetHeaderInfo.getClass().getDeclaredFields();
//		
//		for(Field f : fields){
//			System.out.println("Field Name: "+f.getName());
//		}
		
		contnum.setData("Control number");
		contnum.setMarc_pointer("200|#|#|#");
		assetHeaderInfo.setControl_nuumber(contnum);
		
		ControlNumberIdentifier contnuumid=new ControlNumberIdentifier();
		
		contnuumid.setData("Control number ID");
		assetHeaderInfo.setControl_nuumber_identifier(contnuumid);
		
		Receiver rec=new Receiver();
		rec.setData("Receiver");
		assetHeaderInfo.setReceiver(rec);
		
		Sender sender=new Sender();
		sender.setData("Sender");
		assetHeaderInfo.setSender(sender);
		
		Token token =new Token();
		token.setData("errtert4354tret5465grt6454");
		assetHeaderInfo.setToken(token);
		
		AssetTitle assetTitle=new AssetTitle();
		assetTitle.setData("AssetTitle");
		assetHeaderInfo.setTitle(assetTitle);
		
		AssetSubTitle assetSubTitle=new AssetSubTitle();
		assetSubTitle.setData("assetSubTitle");
		assetHeaderInfo.setSub_title(assetSubTitle);
		
		asset.setAssetHeaderInfo(assetHeaderInfo);

		AssetResourceList assetResourceList = new AssetResourceList();
		AudioRecording audioRecording = new AudioRecording();
		RecordingDate rd=new RecordingDate();
		rd.setData(new Date().toString());
		audioRecording.setRecordingDate(rd);
		TitleOfTrack title= new TitleOfTrack();
		title.setData("Title Of Track");
		audioRecording.setTitleOfTrack(title);
		
		RecordingId rid=new RecordingId();
		rid.setData("recording_id");
		audioRecording.setRecordingId(rid);
		
		RecordingType rtype=new RecordingType();
		rtype.setData("some recording type");
		audioRecording.setRecordingType(rtype);
		
		PublisherNumber pubnum=new PublisherNumber();
		pubnum.setData("234234342342");
		audioRecording.setPublisher_number(pubnum);
		
		Artist displayArtist = new Artist();
		ArtistRole artistRole=new ArtistRole();
		artistRole.setData("Vocalist");
		displayArtist.getArtist_roles().add(artistRole);
		
		
		

		ContactInfo contactInfo = new ContactInfo();
		ContactAddress contAdd=new ContactAddress();
		contAdd.setData("232 Harvard, Boston, MA-02126");
		ContactPhone contPhone=new ContactPhone();
		ContactEmail contEmail=new ContactEmail();
		contEmail.setData("mizanul.chowdhury@gmail.com");
		ContactOfficialWebsite contweb=new ContactOfficialWebsite();
		
		contactInfo.setAddress(contAdd);
		contactInfo.setEmail(contEmail);
		displayArtist.getContact_infos().add(contactInfo);

		Identity identity = new Identity();
		IdentityProvider idp=new IdentityProvider();
		idp.setData("google");
		identity.setIdp(idp);
		
		FullName fname=new FullName();
		fname.setData("Mizanul Chowdhury");
		identity.setName(fname);
		
		UserName uname=new UserName();
		uname.setData("mizanul.chowdhury@gmail.com");
		identity.setUserName(uname);
		
		UID uid=new UID();
		uid.setData("BERKLEEID232323");
		identity.setUid(uid);
		displayArtist.getFull_names().add(identity);

		Ethnicity ethnicity=new Ethnicity();
		ethnicity.setData("BERKLEEID232323");
		displayArtist.setEthnicity(ethnicity);
		
		Gender gender=new Gender();
		gender.setData("M");
		displayArtist.setGender(gender);
		
		Genre genre=new Genre();
		genre.setData("classical");
		displayArtist.setGenre(genre);
		
		GroupName gname=new GroupName();
		gname.setData("classical");
		displayArtist.getGroup_name().add(gname);
		
		Reference reference=new Reference();
		reference.setData("some reff");
		displayArtist.getReferences().add(reference);
		
		RecordingRight recordingRight=new RecordingRight();
		recordingRight.setData("Copy right 2019");
		displayArtist.setRecording_right(recordingRight);
		
		LabelName labelName=new LabelName();
		labelName.setData("labelName");
		displayArtist.setLabel_name(labelName);
		
		Lyric lyric=new Lyric();
		lyric.setData("erewrererfdnjfkjeiofrjoiefksndkljlijeirjwkndjklasiojdilknewkldn");
		displayArtist.setLyrics(lyric);


		AudioTechnicalDetail audioTechnicalDetail = new AudioTechnicalDetail();
		audioTechnicalDetail.setIsPreview(true);
		AudioCodecType audioCodecType=new AudioCodecType();
		audioCodecType.setData("HESD");
		audioTechnicalDetail.setAudioCodecType(audioCodecType);
		
		FileObj fileObject = new FileObj();
		FileName fileNme=new FileName();
		fileNme.setData("O Duniya Ke Rakh Wale");
		fileObject.setFileName(fileNme);
		
		FilePath filePath=new FilePath();
		filePath.setData("http://some-domain/rest/o_duniya_ke_rakh_waLe.mp4");
		fileObject.setFilePath(filePath);
		
		HashSum hashSumObject = new HashSum();
		
		HashSumText hashSumText=new HashSumText();
		hashSumText.setData("rwwerwerewrew");
		hashSumObject.setHashSum(hashSumText);
		
		HashAlg hashAlg=new HashAlg();
		hashAlg.setData("HashSumAlgorithmTyp");
		hashSumObject.setHashSumAlgorithmType(hashAlg);
		fileObject.setHashSumObject(hashSumObject);

		PreviewDetails previewDetails = new PreviewDetails();
		ExpressionType expressionType=new ExpressionType();
		expressionType.setData("wqwewqewqe3e4qwdsdf");
		previewDetails.setExpressionType(expressionType);
		
		StartPoint startPoint =new StartPoint();
		startPoint.setData("hgfhgfhgfhgfhgfhfg");
		previewDetails.setStartPoint(startPoint);

		audioTechnicalDetail.setPreviewDetailsObject(previewDetails);
		
		TechnicalResourceDetailRef technicalResourceDetailRef=new TechnicalResourceDetailRef(); 
		technicalResourceDetailRef.setData("dwqewewqewqeqwewewqe");
		audioTechnicalDetail.setTechnicalResourceDetailsReference(technicalResourceDetailRef);

		audioTechnicalDetail.setFileObject(fileObject);
		displayArtist.setAudio_technical_detail(audioTechnicalDetail);

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
