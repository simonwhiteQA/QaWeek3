package com.qa.community.animal;

public class Dog extends Animal {
	
	public Dog() {
		this("molly", 13);
	}
	
	public Dog(String name, int age) {
		super(name, "westie", "white", age);
	}

	public void dogWoof(String dogName) {
		System.out.println(dogName + " Dog class Woof");
	}

}
