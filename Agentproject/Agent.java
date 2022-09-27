package com.Infinite.Agentproject;

public class Agent {

	private int AgentId;
	private String Name;
	private String City;
	private Gender gender;
	private int MaritalStatus;
	private int premium;
	public int getAgentId() {
		return AgentId;
	}
	public void setAgentId(int agentId) {
		AgentId = agentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}
	public Agent(int agentId, String name, String city, Gender gender, int maritalStatus, int premium) {
		super();
		AgentId = agentId;
		Name = name;
		City = city;
		this.gender = gender;
		MaritalStatus = maritalStatus;
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "Agent [AgentId=" + AgentId + ", Name=" + Name + ", City=" + City + ", gender=" + gender
				+ ", MaritalStatus=" + MaritalStatus + ", premium=" + premium + "]";
	}
	public Agent() {
		// TODO Auto-generated constructor stub
	}
	
}
