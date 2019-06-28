package edu.mit.cxsci.raidar.asset.model.raidarp;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;

public class ContactInfo {
	private ContactAddress address;
	private ContactEmail email;
	private ContactPhone phone;
	private ContactOfficialWebsite officialWebsite;

	public ContactAddress getAddress() {
		return address;
	}

	public void setAddress(ContactAddress address) {
		this.address = address;
	}

	public ContactEmail getEmail() {
		return email;
	}

	public void setEmail(ContactEmail email) {
		this.email = email;
	}

	public ContactPhone getPhone() {
		return phone;
	}

	public void setPhone(ContactPhone phone) {
		this.phone = phone;
	}

	public ContactOfficialWebsite getOfficialWebsite() {
		return officialWebsite;
	}

	public void setOfficialWebsite(ContactOfficialWebsite officialWebsite) {
		this.officialWebsite = officialWebsite;
	}

}
