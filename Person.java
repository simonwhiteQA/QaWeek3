package com.qa.community;

public class Person {

	String name;
	int age; 
	String job;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public void printPerson() {
		System.out.println(name + " (" + age + ") " + job);
	}
	
	
}
