//package edu.mit.cxsci.raidar;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Hashtable;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import edu.mit.cxsci.raidar.asset.model.raidarp.Artist;
//import edu.mit.cxsci.raidar.asset.model.raidarp.Asset;
//import edu.mit.cxsci.raidar.asset.model.raidarp.AssetHeaderInfo;
//import edu.mit.cxsci.raidar.asset.model.raidarp.AssetResourceList;
//import edu.mit.cxsci.raidar.asset.model.raidarp.AudioRecording;
//import edu.mit.cxsci.raidar.asset.model.raidarp.AudioTechnicalDetail;
//import edu.mit.cxsci.raidar.asset.model.raidarp.CLine;
//import edu.mit.cxsci.raidar.asset.model.raidarp.ContactInfo;
//import edu.mit.cxsci.raidar.asset.model.raidarp.DealList;
//import edu.mit.cxsci.raidar.asset.model.raidarp.FileObj;
//import edu.mit.cxsci.raidar.asset.model.raidarp.HashSum;
//import edu.mit.cxsci.raidar.asset.model.raidarp.Identity;
//import edu.mit.cxsci.raidar.asset.model.raidarp.ImageDetailsByTerritory;
//import edu.mit.cxsci.raidar.asset.model.raidarp.ImageList;
//import edu.mit.cxsci.raidar.asset.model.raidarp.MovieRecording;
//import edu.mit.cxsci.raidar.asset.model.raidarp.PreviewDetails;
//import edu.mit.cxsci.raidar.asset.model.raidarp.Release;
//import edu.mit.cxsci.raidar.asset.model.raidarp.ReleaseDeal;
//import edu.mit.cxsci.raidar.asset.model.raidarp.ReleaseList;
//import edu.mit.cxsci.raidar.asset.model.raidarp.VideRecording;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ArtistRole;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.AssetSubTitle;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.AssetTitle;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.AudioCodecType;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ContactAddress;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ContactEmail;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ContactOfficialWebsite;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ContactPhone;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ControlNumber;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ControlNumberIdentifier;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Ethnicity;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.ExpressionType;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.FileName;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.FilePath;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.FullName;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Gender;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Genre;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.GroupName;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.HashAlg;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.HashSumText;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.IdentityProvider;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.LabelName;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Leader;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Lyric;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.PublisherNumber;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Receiver;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.RecordingDate;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.RecordingId;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.RecordingRight;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.RecordingType;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Reference;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Sender;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.StartPoint;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.TechnicalResourceDetailRef;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.TitleOfTrack;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.Token;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.UID;
//import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.UserName;
//import edu.mit.cxsci.raidar.util.Utilities;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class RaidarModelTests {
//	@Test
//	public void objectMapping() {
//		
//		
//	}
//	@Test
//	public void FromJsonToModel() {
//		String jsonString = Utilities.getInstance().loadJSONTest("data/raidar_data.json");
//		GsonBuilder builder = new GsonBuilder();
//		builder.setPrettyPrinting();
//		Asset asset = new Asset();
//		Gson gson = builder.create();
//		
//		asset = gson.fromJson(jsonString, Asset.class);
//		System.out.println(asset);
//	}
//	
//	@Test
//	public void fromModelToJson() {
//		GsonBuilder builder = new GsonBuilder();
//		builder.setPrettyPrinting();
//		Asset asset = new Asset();
//		Gson gson = builder.create();
//	
//		AssetHeaderInfo assetHeaderInfo = new AssetHeaderInfo();
//		
//		Leader leader=new Leader();
//		leader.setData("sadsads ddsdsaddew 34343");
//		assetHeaderInfo.setLeader(leader);
//		
//		ControlNumber contnum=new ControlNumber();
//
//		contnum.setData("Control number");
//		contnum.setMarc_pointer("200|#|#|#");
//		assetHeaderInfo.setControl_nuumber(contnum);
//		
//		ControlNumberIdentifier contnuumid=new ControlNumberIdentifier();
//		
//		contnuumid.setData("Control number ID");
//		assetHeaderInfo.setControl_nuumber_identifier(contnuumid);
//		
//		Receiver rec=new Receiver();
//		rec.setData("Receiver");
//		assetHeaderInfo.setReceiver(rec);
//		
//		Sender sender=new Sender();
//		sender.setData("Sender");
//		assetHeaderInfo.setSender(sender);
//		
//		Token token =new Token();
//		token.setData("errtert4354tret5465grt6454");
//		assetHeaderInfo.setToken(token);
//		
//		AssetTitle assetTitle=new AssetTitle();
//		assetTitle.setData("AssetTitle");
//		assetHeaderInfo.setTitle(assetTitle);
//		
//		AssetSubTitle assetSubTitle=new AssetSubTitle();
//		assetSubTitle.setData("assetSubTitle");
//		assetHeaderInfo.setSub_title(assetSubTitle);
//		
//		asset.setAssetHeaderInfo(assetHeaderInfo);
//
//		AssetResourceList assetResourceList = new AssetResourceList();
//		AudioRecording audioRecording = new AudioRecording();
//		RecordingDate rd=new RecordingDate();
//		rd.setData(new Date().toString());
//		audioRecording.setRecordingDate(rd);
//		TitleOfTrack title= new TitleOfTrack();
//		title.setData("Title Of Track");
//		audioRecording.setTitleOfTrack(title);
//		
//		RecordingId rid=new RecordingId();
//		rid.setData("recording_id");
//		audioRecording.setRecordingId(rid);
//		
//		RecordingType rtype=new RecordingType();
//		rtype.setData("some recording type");
//		audioRecording.setRecordingType(rtype);
//		
//		PublisherNumber pubnum=new PublisherNumber();
//		pubnum.setData("234234342342");
//		audioRecording.setPublisher_number(pubnum);
//		
//		Artist displayArtist = new Artist();
//		ArtistRole artistRole=new ArtistRole();
//		artistRole.setData("Vocalist");
//		displayArtist.getArtist_roles().add(artistRole);
//		
//		
//		
//
//		ContactInfo contactInfo = new ContactInfo();
//		ContactAddress contAdd=new ContactAddress();
//		contAdd.setData("232 Harvard, Boston, MA-02126");
//		ContactPhone contPhone=new ContactPhone();
//		ContactEmail contEmail=new ContactEmail();
//		contEmail.setData("mizanul.chowdhury@gmail.com");
//		ContactOfficialWebsite contweb=new ContactOfficialWebsite();
//		
//		contactInfo.setAddress(contAdd);
//		contactInfo.setEmail(contEmail);
//		displayArtist.getContact_infos().add(contactInfo);
//
//		Identity identity = new Identity();
//		IdentityProvider idp=new IdentityProvider();
//		idp.setData("google");
//		identity.setIdp(idp);
//		
//		FullName fname=new FullName();
//		fname.setData("Mizanul Chowdhury");
//		identity.setName(fname);
//		
//		UserName uname=new UserName();
//		uname.setData("mizanul.chowdhury@gmail.com");
//		identity.setUserName(uname);
//		
//		UID uid=new UID();
//		uid.setData("BERKLEEID232323");
//		identity.setUid(uid);
//		displayArtist.getFull_names().add(identity);
//
//		Ethnicity ethnicity=new Ethnicity();
//		ethnicity.setData("BERKLEEID232323");
//		displayArtist.setEthnicity(ethnicity);
//		
//		Gender gender=new Gender();
//		gender.setData("M");
//		displayArtist.setGender(gender);
//		
//		Genre genre=new Genre();
//		genre.setData("classical");
//		displayArtist.setGenre(genre);
//		
//		GroupName gname=new GroupName();
//		gname.setData("classical");
//		displayArtist.getGroup_name().add(gname);
//		
//		Reference reference=new Reference();
//		reference.setData("some reff");
//		displayArtist.getReferences().add(reference);
//		
//		RecordingRight recordingRight=new RecordingRight();
//		recordingRight.setData("Copy right 2019");
//		displayArtist.setRecording_right(recordingRight);
//		
//		LabelName labelName=new LabelName();
//		labelName.setData("labelName");
//		displayArtist.setLabel_name(labelName);
//		
//		Lyric lyric=new Lyric();
//		lyric.setData("erewrererfdnjfkjeiofrjoiefksndkljlijeirjwkndjklasiojdilknewkldn");
//		displayArtist.setLyrics(lyric);
//
//
//		AudioTechnicalDetail audioTechnicalDetail = new AudioTechnicalDetail();
//		audioTechnicalDetail.setIsPreview(true);
//		AudioCodecType audioCodecType=new AudioCodecType();
//		audioCodecType.setData("HESD");
//		audioTechnicalDetail.setAudioCodecType(audioCodecType);
//		
//		FileObj fileObject = new FileObj();
//		FileName fileNme=new FileName();
//		fileNme.setData("O Duniya Ke Rakh Wale");
//		fileObject.setFileName(fileNme);
//		
//		FilePath filePath=new FilePath();
//		filePath.setData("http://some-domain/rest/o_duniya_ke_rakh_waLe.mp4");
//		fileObject.setFilePath(filePath);
//		
//		HashSum hashSumObject = new HashSum();
//		
//		HashSumText hashSumText=new HashSumText();
//		hashSumText.setData("rwwerwerewrew");
//		hashSumObject.setHashSum(hashSumText);
//		
//		HashAlg hashAlg=new HashAlg();
//		hashAlg.setData("HashSumAlgorithmTyp");
//		hashSumObject.setHashSumAlgorithmType(hashAlg);
//		fileObject.setHashSumObject(hashSumObject);
//
//		PreviewDetails previewDetails = new PreviewDetails();
//		ExpressionType expressionType=new ExpressionType();
//		expressionType.setData("wqwewqewqe3e4qwdsdf");
//		previewDetails.setExpressionType(expressionType);
//		
//		StartPoint startPoint =new StartPoint();
//		startPoint.setData("hgfhgfhgfhgfhgfhfg");
//		previewDetails.setStartPoint(startPoint);
//
//		audioTechnicalDetail.setPreviewDetailsObject(previewDetails);
//		
//		TechnicalResourceDetailRef technicalResourceDetailRef=new TechnicalResourceDetailRef(); 
//		technicalResourceDetailRef.setData("dwqewewqewqeqwewewqe");
//		audioTechnicalDetail.setTechnicalResourceDetailsReference(technicalResourceDetailRef);
//
//		audioTechnicalDetail.setFileObject(fileObject);
//		displayArtist.setAudio_technical_detail(audioTechnicalDetail);
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
//		
//		String jsonString2 = gson.toJson(asset);
//		System.out.println(jsonString2);
//	}
//	
//	@Test
//	public void findKey() {
//		String value="PublisherorDistributorNumber";
//		String key=Utilities.getInstance().FindMarcKey(value);
//		System.out.println("Value of key==" + key);
//	}
//	
//
//	
//}
