package edu.mit.cxsci.raidar.asset.model.ddex;

/**
 *
 * @author Mizanul H. Chowdhuury
 * @version 1.0
 **/

public class Release {
	ReleaseId ReleaseIdObject;
	private String ReleaseReference;
	ReferenceTitle ReferenceTitleObject;
	ReleaseResourceReferenceList ReleaseResourceReferenceListObject;
	private String ReleaseType;
	ReleaseDetailsByTerritory ReleaseDetailsByTerritoryObject;
	PLine PLineObject;
	CLine CLineObject;

	public ReleaseId getReleaseId() {
		return ReleaseIdObject;
	}

	public String getReleaseReference() {
		return ReleaseReference;
	}

	public ReferenceTitle getReferenceTitle() {
		return ReferenceTitleObject;
	}

	public ReleaseResourceReferenceList getReleaseResourceReferenceList() {
		return ReleaseResourceReferenceListObject;
	}

	public String getReleaseType() {
		return ReleaseType;
	}

	public ReleaseDetailsByTerritory getReleaseDetailsByTerritory() {
		return ReleaseDetailsByTerritoryObject;
	}

	public PLine getPLine() {
		return PLineObject;
	}

	public CLine getCLine() {
		return CLineObject;
	}

	public void setReleaseId(ReleaseId ReleaseIdObject) {
		this.ReleaseIdObject = ReleaseIdObject;
	}

	public void setReleaseReference(String ReleaseReference) {
		this.ReleaseReference = ReleaseReference;
	}

	public void setReferenceTitle(ReferenceTitle ReferenceTitleObject) {
		this.ReferenceTitleObject = ReferenceTitleObject;
	}

	public void setReleaseResourceReferenceList(ReleaseResourceReferenceList ReleaseResourceReferenceListObject) {
		this.ReleaseResourceReferenceListObject = ReleaseResourceReferenceListObject;
	}

	public void setReleaseType(String ReleaseType) {
		this.ReleaseType = ReleaseType;
	}

	public void setReleaseDetailsByTerritory(ReleaseDetailsByTerritory ReleaseDetailsByTerritoryObject) {
		this.ReleaseDetailsByTerritoryObject = ReleaseDetailsByTerritoryObject;
	}

	public void setPLine(PLine PLineObject) {
		this.PLineObject = PLineObject;
	}

	public void setCLine(CLine CLineObject) {
		this.CLineObject = CLineObject;
	}
}
