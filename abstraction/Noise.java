package com.qa.community.abstraction;

public interface Noise {
	
	default void makeNoise() {
		//default if sub classes haven't implemented detail
				//for method
				System.out.println("An animal is making a noise");
	}

}
