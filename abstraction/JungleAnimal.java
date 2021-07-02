package com.qa.community.abstraction;

public class JungleAnimal extends Animal {
	
	private String name;
	private String type;
	private int age;
	
	
	public void makeNoise() {
		System.out.println("Gorilla go oo");
	}
	
	public void eating() {
		System.out.println("Gorilla is eating leaves");
	}
	
	public String jungleInfo() {
		return getName() + " " + getType() + " " + getAge();
	}
	
	public JungleAnimal(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
