package com.qa.community.teamTask;

public class Runner {
	
	public static void main(String[] args) {
		
		Continent africa = new Africa(80000);
		Country country = new Country("Zimbabwe");
		Country country2 = new Country("Kenya");
		africa.addCountry(country);
		africa.addCountry(country2);
		City city = new City("Harare", 2000);
		City city2 = new City("Bulawayo", 2796);
		City city3 = new City("Chitungwiza", 3466);
		City city4 = new City("Nairobi", 300);
		country.addCity(city);
		country.addCity(city2);
		country.addCity(city3);
		country2.addCity(city4);
		
		
		System.out.println("---Get Birth Rate Method---");
		System.out.println("Continent Birth Rate: " + africa.birthRate());
		System.out.println(country.getName() + "birth Rate: " + country.birthRate());
		System.out.println(country2.getName() + "birth Rate: " + country2.birthRate());
		
		System.out.println("\n---Print Country Info---");
		System.out.println(africa.printInfo());
		
	}
	

}
