package com.infinite.ServletAgent;

public class Agent {
private int Agentid;
private String name;
private String city;
private String gender;
private int maritalstatus;
private Double premium;
public int getAgentid() {
	return Agentid;
}
public void setAgentid(int agentid) {
	Agentid = agentid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getMaritalstatus() {
	return maritalstatus;
}
public void setMaritalstatus(int maritalstatus) {
	this.maritalstatus = maritalstatus;
}
public Double getPremium() {
	return premium;
}
public void setPremium(Double premium) {
	this.premium = premium;
}
@Override
public String toString() {
	return "Agent [Agentid=" + Agentid + ", name=" + name + ", city=" + city + ", gender=" + gender + ", maritalstatus="
			+ maritalstatus + ", premium=" + premium + "]";
}
public Agent(int agentid, String name, String city, String gender, int maritalstatus, Double premium) {
	Agentid = agentid;
	this.name = name;
	this.city = city;
	this.gender = gender;
	this.maritalstatus = maritalstatus;
	this.premium = premium;
}
public Agent() {
	// TODO Auto-generated constructor stub
}

}
