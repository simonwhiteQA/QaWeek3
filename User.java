package com.qa.community;

import java.util.ArrayList;

public class User {
	
	private String forename;
	private String surname;
	private int age;
	private String email;
	private String telephoneNo;
	private ArrayList<String> middleNames = new ArrayList<String>();
	
	//Empty Constructor
	public User() {
		
	}

	//get and set forename
	public String getForename() {
		return this.forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	//get and set surname
	public String getSurname() {
		return this.surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	// get and set age
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// get and set email
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// get and set telephone number
	public String getTelephoneNo() {
		return this.telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	
	// get and set middle names
	public ArrayList<String> getMiddleNames() {
		return this.middleNames;
	}

	public void addMiddleName(String middleNames) {
		this.middleNames.add(middleNames);
	}

	public void setMiddleNames(ArrayList<String> middleNames) {
		this.middleNames = middleNames;
	}
	
	@Override
	public String toString() {
		return getForename() + " " + getMiddleNames() + " " + getSurname() + " " + getAge() + " " + getEmail() 
		+ " " + getTelephoneNo();
	}

}
