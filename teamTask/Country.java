package com.qa.community.teamTask;

import java.util.ArrayList;
import java.util.List;

public class Country implements BirthRateTotal {
	
	private String name;
	private List<City> cities;
	
	public void addCity(City c) {
		cities.add(c);
	}

	public Country(String name) {
		this.cities = new ArrayList<>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int birthRate() {
		int i = 0;
		for (City c : cities) {
			i = i + c.getBirthRate();
		}
		return i;
	}
	
	@Override 
	public String toString() {
		return getName();
	}
	

}
