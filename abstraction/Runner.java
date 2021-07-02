package com.qa.community.abstraction;

public class Runner {
	
	public static void main(String[] args) {
		Animal sheep = new FarmAnimal("Shaun", "Sheep", 5);
		Animal shark = new OceanAnimal("Lenny", "Shark", 24);
		Animal gorilla = new JungleAnimal("George", "Gorilla", 9);
		Animal dog = new HouseAnimal("Bill", "Dog", 8);
		FarmAnimal sheep2 = (FarmAnimal) sheep;
		OceanAnimal shark2 = (OceanAnimal) shark;
		JungleAnimal gorilla2 = (JungleAnimal) gorilla;
		HouseAnimal dog2 = (HouseAnimal) dog;
		
		System.out.println("---Animal Info---");
		System.out.println(sheep2.farmInfo());
		System.out.println(shark2.oceanInfo());
		System.out.println(gorilla2.jungleInfo());
		System.out.println(dog2.houseInfo());
		
		System.out.println("\n---Animals Eating---");
		sheep.eating();
		gorilla.eating();
		shark.eating();
		dog.eating();
		
		System.out.println("\n---Animals Noise---");
		sheep.makeNoise();
		gorilla.makeNoise();
		shark.makeNoise();
		dog.makeNoise();
		
	}
	
	

}
