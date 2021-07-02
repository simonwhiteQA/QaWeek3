package com.qa.community.teamTask;

public class City {
	
	private String name;
	private int birthRate;
	
	public City(String name, int birthRate) {
		this.name = name;
		this.birthRate = birthRate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthRate() {
		return birthRate;
	}
	public void setBirthRate(int birthRate) {
		this.birthRate = birthRate;
	}
	
	

}
