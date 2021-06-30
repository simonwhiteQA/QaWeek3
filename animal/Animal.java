package com.qa.community.animal;

public class Animal {
	
	private String name;
	private String breed;
	private String colour;
	private int age;
	
	final public void dogEat(String dogName) {
		System.out.println(dogName + " dog eats (final method)");
	}
	
	public Animal() {
		
	}
	
	public Animal(String name, String breed, String colour, int age) {
		this.name = name;
		this.breed = breed;
		this.colour = colour;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
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
	
	@Override
	public String toString() {
		return "Name:" + getName() + " Breed:" + getBreed() + " Colour:" + getColour() + " Age:" + getAge();
	}
	

}
