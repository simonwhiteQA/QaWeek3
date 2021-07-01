package com.qa.community.garage;

public class Vehicle {
	
	private int yearMan;
	private String type;
	private String make;
	private String vehicleType;
	private int price;
	
	public void getVehicle() {
		System.out.println("Vehicle Info: (" + getYearMan() + ") " + getType() + " " + getMake() + " - " + getVehicleType());
	}
	
	public Vehicle(int yearMan, String type, String make, String vehicleType, int price) {
		super();
		this.yearMan = yearMan;
		this.type = type;
		this.make = make;
		this.vehicleType = vehicleType;
		this.price = price;
	}

	public Vehicle() {
		// TODO Auto-generated constructor stub
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
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle Info: (" + getYearMan() + ") " + getType() + " " + getMake() + " - " + getVehicleType();
	}

}
