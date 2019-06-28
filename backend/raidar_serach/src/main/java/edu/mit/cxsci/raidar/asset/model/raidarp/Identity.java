package edu.mit.cxsci.raidar.asset.model.raidarp;

import edu.mit.cxsci.raidar.asset.model.raider.marc.pointer.*;

public class Identity {
private FullName name;
private UserName user_name;
private UID uid;
private IdentityProvider idp;

public UID getUid() {
	return uid;
}
public void setUid(UID id) {
	this.uid = id;
}
public UserName getUserName() {
	return user_name;
}
public void setUserName(UserName userName) {
	this.user_name = userName;
}
public FullName getName() {
	return name;
}
public void setName(FullName name) {
	this.name = name;
}
public IdentityProvider getIdp() {
	return idp;
}
public void setIdp(IdentityProvider idp) {
	this.idp = idp;
}
}
