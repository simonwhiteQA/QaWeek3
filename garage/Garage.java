package com.qa.community.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
		private List<Vehicle> vehicles;
		
		public Garage() {
			this.vehicles = new ArrayList<>();
		}
		
		public void addVehicle(Vehicle v) {
			vehicles.add(v);
		}
		
		public void pricing(Vehicle v) {
			if (v instanceof Car) {
				System.out.println("Car Price: £1000");
			} 
			
			else if (v instanceof Motorbike) {
				System.out.println("Motorbike Price: £2000");
			}
			
			else if (v instanceof Scooter) {
				System.out.println("Scooter Price: £500");
			}
		}
		
	}
