package com.qa.community.garage;

public class Vehicle {
	
	private int yearMan;
	private String type;
	private String make;
	
	public void getVehicle() {
		System.out.println("Vehicle Info: (" + getYearMan() + ") " + getType() + " " + getMake());
	}
	
	
	public Vehicle(int yearMan, String type, String make) {
		super();
		this.yearMan = yearMan;
		this.type = type;
		this.make = make;
	}


	public Vehicle() {
		
	}

	public int getYearMan() {
		return yearMan;
	}
	public void setYearMan(int yearMan) {
		this.yearMan = yearMan;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	

}
