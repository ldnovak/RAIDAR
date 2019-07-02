package edu.mit.cxsci.raidar.asset.model.ddex;

/**
*
* @author Mizanul H. Chowdhuury
* @version 1.0
**/

public class ParentObject {
	private MessageHeader MessageHeader;
	public MessageHeader getMessageHeader() {
		return MessageHeader;
	}
	public void setMessageHeader(MessageHeader messageHeader) {
		MessageHeader = messageHeader;
	}
	public PartyList getPartyList() {
		return PartyList;
	}
	public void setPartyList(PartyList partyList) {
		PartyList = partyList;
	}
	public ResourceList getResourceList() {
		return ResourceList;
	}
	public void setResourceList(ResourceList resourceList) {
		ResourceList = resourceList;
	}
	public ReleaseList getReleaseList() {
		return ReleaseList;
	}
	public void setReleaseList(ReleaseList releaseList) {
		ReleaseList = releaseList;
	}
	public DealList getDealList() {
		return DealList;
	}
	public void setDealList(DealList dealList) {
		DealList = dealList;
	}
	private PartyList PartyList;
	private ResourceList ResourceList;
	private ReleaseList ReleaseList;
	private DealList DealList;
}
