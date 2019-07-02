package edu.mit.cxsci.raidar.asset.model.raidar;

public class Identity {
private String name;
private String user_name;
private String id;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUserName() {
	return user_name;
}
public void setUserName(String userName) {
	this.user_name = userName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIdp() {
	return idp;
}
public void setIdp(String idp) {
	this.idp = idp;
}
private String idp;
}
