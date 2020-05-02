package com.cg.model;

public class Property {

	private int propertyId;
	private String propertyType;
	private String room;
	private double budget;
	private String popertyStatus;
	private String areaPerSq;
	private int floorNo;
	private String location;
	private String locality;
	
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	//Constructor for Flat
	public Property(int propertyId, String propertyType, String room, double budget, String popertyStatus,
			String areaPerSq, int floorNo, String location, String locality) {
		super();
		this.propertyId = propertyId;
		this.propertyType = propertyType;
		this.room = room;
		this.budget = budget;
		this.popertyStatus = popertyStatus;
		this.areaPerSq = areaPerSq;
		this.floorNo = floorNo;
		this.location = location;
		this.locality = locality;
	}




	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getPopertyStatus() {
		return popertyStatus;
	}
	public void setPopertyStatus(String popertyStatus) {
		this.popertyStatus = popertyStatus;
	}
	public String getAreaPerSq() {
		return areaPerSq;
	}
	public void setAreaPerSq(String areaPerSq) {
		this.areaPerSq = areaPerSq;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}

	
	
	

}
