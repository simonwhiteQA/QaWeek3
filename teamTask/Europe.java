package com.qa.community.teamTask;

import java.util.List;

public class Europe extends Continent {

	public Europe(int continentPopulation, List<Country> countries) {
		super(continentPopulation, countries);
	}

	@Override
	public String printInfo() {
		return "European Info: " + getContinentPopulation();
	}


}