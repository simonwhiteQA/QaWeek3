package com.qa.community.teamTask;

import java.util.List;

public class Asia extends Continent {
	
	public Asia(int continentPopulation, List<Country> countries) {
		super(continentPopulation, countries);
	}

	@Override
	public String printInfo() {
		return "Asian Info: " + getContinentPopulation();
	}
	

}
