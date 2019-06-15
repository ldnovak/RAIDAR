package edu.mit.cxsci.raidar.asset.model.raider;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class AssetHeaderInfo {
	private String id;
	private String leader;
	private String date;
	private String control_id;
	private String receiver;
	private String sender;
	private String token;
	private String title;
	private String sub_title;
	private String copyright;

	public String getID() {
		return id;
	}

	public String getLEADER() {
		return leader;
	}

	public String getDate() {
		return date;
	}

	public String getControlID() {
		return control_id;
	}

	public String getReceiver() {
		return receiver;
	}

	public String getSender() {
		return sender;
	}

	public String getToken() {
		return token;
	}

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return sub_title;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setID(String ID) {
		this.id = ID;
	}

	public void setLEADER(String LEADER) {
		this.leader = LEADER;
	}

	public void setDate(String Date) {
		this.date = Date;
	}

	public void setControlID(String ControlID) {
		this.control_id = ControlID;
	}

	public void setReceiver(String Receiver) {
		this.receiver = Receiver;
	}

	public void setSender(String Sender) {
		this.sender = Sender;
	}

	public void setToken(String Token) {
		this.token = Token;
	}

	public void setTitle(String Title) {
		this.title = Title;
	}

	public void setSubTitle(String SubTitle) {
		this.sub_title = SubTitle;
	}

	public void setCopyright(String Copyright) {
		this.copyright = Copyright;
	}
}
