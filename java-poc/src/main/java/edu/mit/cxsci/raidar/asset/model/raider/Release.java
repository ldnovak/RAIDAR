package edu.mit.cxsci.raidar.asset.model.raider;

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
	private String ReleaseDetailsByTerritory;
	private String PLine;
	CLine c_line;



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

	public String getReleaseDetailsByTerritory() {
		return ReleaseDetailsByTerritory;
	}

	public String getPLine() {
		return PLine;
	}

	public CLine getCLine() {
		return c_line;
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

	public void setReleaseDetailsByTerritory(String ReleaseDetailsByTerritory) {
		this.ReleaseDetailsByTerritory = ReleaseDetailsByTerritory;
	}

	public void setPLine(String PLine) {
		this.PLine = PLine;
	}

	public void setCLine(CLine CLineObject) {
		this.c_line = CLineObject;
	}
}
