package com.qa.community.abstraction;

public abstract class Animal implements Eat, Noise {
	
	private String type;
	private String colour;
	private int age;
	
	public Animal() {
		
	}
	
	public Animal(String type, String colour, int age) {
		this.type = type;
		this.colour = colour;
		this.age = age;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
