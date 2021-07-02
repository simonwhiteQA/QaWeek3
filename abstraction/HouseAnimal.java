package com.qa.community.abstraction;

public class HouseAnimal extends Animal  {
	
	private String name;
	private String type;
	private int age;
	

	public void makeNoise() {
		System.out.println("Dogs go woof");
	}
	
	public void eating() {
		System.out.println("Dog is eating dog food");
	}
	
	public String houseInfo() {
		return getName() + " " + getType() + " " + getAge();
	}
	
	public HouseAnimal(String name, String type, int age) {
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
