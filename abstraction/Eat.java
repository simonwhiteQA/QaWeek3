package com.qa.community.abstraction;

public interface Eat {
	
	default void eating() {
		//default if sub classes haven't implemented detail
		//for method
		System.out.println("An animal is eating");
		
	}
	
}
