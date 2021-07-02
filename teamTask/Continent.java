package com.qa.community.teamTask;

import java.util.ArrayList;
import java.util.List;

public abstract class Continent implements BirthRateTotal {
	
	private int continentPopulation;
	private List<Country> countries;
	
	public void addCountry(Country c) {
		countries.add(c);
	}
	
	@Override
	public int birthRate() {
		int i = 0;
		for (Country c : countries) {
			i = i + c.birthRate();
		}
		return i;
	}
	
	public Continent(int population) {
		this.countries = new ArrayList<>();
		this.continentPopulation = population;
	}
	
	public Continent() {
		this.countries = new ArrayList<>();
	}

	public Continent(int continentPopulation, List<Country> countries) {
		super();
		this.continentPopulation = continentPopulation;
		this.setCountries(countries);
	}

	public int getContinentPopulation() {
		return continentPopulation;
	}

	public void setContinentPopulation(int continentPopulation) {
		this.continentPopulation = continentPopulation;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	} 
	

	//Abstract method included to require implementation from other classes
		//Implementation is not necessary here
		//This is useful when developing as it ensures instances of continents
		//require implementation for this method
		public abstract String printInfo();
}
