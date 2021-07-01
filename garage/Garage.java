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
		
		public void removeVehicle(int i) {
			vehicles.remove(i);
		}
		
		public void removeVehicleType(String s) {

			for (int i=0; i < vehicles.size(); i++) {
				if (vehicles.get(i).getVehicleType().equalsIgnoreCase(s)) {
					vehicles.remove(i);
					i--;
				}
			}

		}
		
		public void printVehicles() {
			for (Vehicle i : vehicles) {
				System.out.println(i);
			}
		}
		
		public void pricing() {
			for (Vehicle i : vehicles) {
				System.out.println(i.getType() + " " + i.getMake() + " Price: £" + i.getPrice());
			}
		}
		
		public void fixVehicle(Vehicle v) {

			if (v instanceof Car) {
				System.out.println("Car Fix: £200");
			}

			else if (v instanceof Motorbike) {
				System.out.println("Motorbike Fix: £150");
			}

			else if (v instanceof Scooter) {
				System.out.println("Scooter Price: £75");
			}

		}
		
		public void emptyGarage () {
			vehicles.removeAll(vehicles);
			
			if (vehicles.isEmpty() == true){
				System.out.println("Garage is empty.");
			} else {
				System.out.println("Empyting garage has failed.");
			}
			
		}
		
	}
