package com.qa.community.garage;

public class Runner {
	
	public static void main(String[] args) {
		Garage g = new Garage();
		Car c  = new Car(2019, "Hyundai", "i20");
		Motorbike m  = new Motorbike(2005, "Harley Davidson", "hd35");
		Scooter s  = new Scooter(1990, "Moped", "e56");
	
		g.addVehicle(s);
		g.addVehicle(m);
		g.addVehicle(c);
		
		System.out.println("---Vehicle Info---");
		c.getVehicle();
		m.getVehicle();
		s.getVehicle();
		
		System.out.println("\n---Pricing---");
		g.pricing(c);
		g.pricing(m);
		g.pricing(s);
		
	}


}
