package com.qa.community.teamTask;

import java.util.List;

public class Africa extends Continent {
	
	public Africa () {
		
	}
	
	public Africa(int continentPopulation, List<Country> countries) {
		super(continentPopulation, countries);
	}
	
	public Africa(int continentPopulation) {
		super(continentPopulation);
	}

	@Override
	public String printInfo() {
		return "African Info: " + getContinentPopulation() + " " + getCountries().toString();
	}
	

}
