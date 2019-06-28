package edu.mit.cxsci.raidar.asset.model.raidarp;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class AssetHeaderInfo {
	private Leader Leader;
	private ControlNumber ControlNumber;
	private ControlNumberIdentifier ControlNumberIdentifier;
	private Receiver Receiver;
	private Sender Sender;
	private Token Token;
	private AssetTitle title;
	private AssetSubTitle sub_title;
	private Copyright copyright;
	
	public Leader getLeader() {
		return Leader;
	}
	public void setLeader(Leader leader) {
		this.Leader = leader;
	}
	public ControlNumber getControl_nuumber() {
		return ControlNumber;
	}
	public void setControl_nuumber(ControlNumber control_nuumber) {
		this.ControlNumber = control_nuumber;
	}
	public ControlNumberIdentifier getControl_nuumber_identifier() {
		return ControlNumberIdentifier;
	}
	public void setControl_nuumber_identifier(ControlNumberIdentifier control_nuumber_identifier) {
		this.ControlNumberIdentifier = control_nuumber_identifier;
	}
	public Receiver getReceiver() {
		return Receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.Receiver = receiver;
	}
	public Sender getSender() {
		return Sender;
	}
	public void setSender(Sender sender) {
		this.Sender = sender;
	}
	public Token getToken() {
		return Token;
	}
	public void setToken(Token token) {
		this.Token = token;
	}
	public AssetTitle getTitle() {
		return title;
	}
	public void setTitle(AssetTitle title) {
		this.title = title;
	}
	public AssetSubTitle getSub_title() {
		return sub_title;
	}
	public void setSub_title(AssetSubTitle sub_title) {
		this.sub_title = sub_title;
	}
	public Copyright getCopyright() {
		return copyright;
	}
	public void setCopyright(Copyright copyright) {
		this.copyright = copyright;
	}
	}
