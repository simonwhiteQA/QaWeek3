package com.qa.community.scanner;

import java.util.Scanner;

//Task 1
//Create a simple UML class diagram to demonstrate the Garage exercise,upload this to your
//repository alongside the code for your Garage task
//
//Task 2
//Create a project that has four methods;addition,subtraction,multiplication,and division.
//All of these methods should take two numbers as parameters.
//Create a method to ask the user which of the four methods they wish to use, then take the
//numbers as user input for the operation and output the result back to the user.

public class scannerExercise {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		getInputAndPerformCalculation();
		scanner.close();
		
	}
	
	public static void getInputAndPerformCalculation() {
		System.out.println("Which operation would you like to perform?");
		String input = scanner.nextLine();
		double num1;
		double num2;
		
		System.out.println("Enter Num 1; ");
		num1 = getNumber();
		System.out.println("Enter Num 2; ");
		num2 = getNumber();
		
		switch (input) {
		case "+":
			System.out.println(add(num1, num2));
			break;
		case "-":
			System.out.println(subtract(num1, num2));
			break;
		case "/":
			System.out.println(divide(num1, num2));
			break;
		case "*":
			System.out.println(multiply(num1, num2));
			break;
		default: 
			System.out.println("Invalid Operation");
		}
	}
	
	
	
	private static double getNumber() {
		return scanner.nextDouble();
	}

	public static double add(double num1, double num2 ) {
		return num1+num2;
	}
	
	public static double subtract(double num1, double num2 ) {
		return num1-num2;
	}
	
	public static double multiply(double num1, double num2 ) {
		return num1*num2;
	}
	
	public static double divide(double num1, double num2 ) {
		return num1/num2;
	}

}
