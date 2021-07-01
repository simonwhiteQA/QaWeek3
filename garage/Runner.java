package com.qa.community.garage;

public class Runner {
	
	public static void main(String[] args) {
		Garage g = new Garage();
		Car c  = new Car(2019, "Hyundai", "i20", "Car", 15000);
		Car c2  = new Car(2021, "BMW", "i8", "Car", 80499);
		Motorbike m  = new Motorbike(2005, "Harley Davidson", "hd35", "Motorbike", 19999);
		Scooter s  = new Scooter(1990, "Moped", "e56", "Scooter", 1499);
	
		g.addVehicle(s);
		g.addVehicle(m);
		g.addVehicle(c);
		g.addVehicle(c2);
		
		System.out.println("---Vehicle Info---");
		c.getVehicle();
		m.getVehicle();
		s.getVehicle();
		c2.getVehicle();
		
		System.out.println("\n---Pricing of vehicles---");
		g.pricing();
		
		System.out.println("\n---Remove Scooter---");
		g.removeVehicle(0);
		g.printVehicles();
		
		System.out.println("\n---Fix Motorbike Bill---");
		g.fixVehicle(m);
		
		System.out.println("\n---Empty all Cars---");
		g.removeVehicleType("Car");
		g.printVehicles();
		
		System.out.println("\n---Empty Garage---");
		g.emptyGarage();
		
		
	}


}
