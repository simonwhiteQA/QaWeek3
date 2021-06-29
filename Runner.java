package com.qa.community;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
public static void main(String[] args) {
		
//		Person person1 = new Person("Simon", 22, "SDET Trainee");
//		Person person2 = new Person("Megan", 23, "Web Design");
//		Person person3 = new Person("Niall", 24, "Python Level 3");
//		Person person4 = new Person("Bob", 31, "SDET Specialist");
//		Person person5 = new Person("Patrick", 19, "Tester");
//		
//		List<Person> listPerson = new ArrayList<>();
//		listPerson.add(person1);
//		listPerson.add(person2);
//		listPerson.add(person3);
//		listPerson.add(person4);
//		listPerson.add(person5);
//		
//		for (Person i : listPerson){
//			i.printPerson();
//		}
	
		
	System.out.println("---User Information---");
		User user1 = new User();
		user1.setForename("Simon");
		user1.setSurname("White");
		user1.setAge(22);
		user1.setEmail("simon@email.com");
		user1.setTelephoneNo("07775730253");
		user1.addMiddleName("John");
		user1.addMiddleName("Mark");
		
		User user2 = new User();
		user2.setForename("Niall");
		user2.setSurname("Duggan");
		user2.setAge(22);
		user2.setEmail("niall@email.com");
		user2.setTelephoneNo("07775730253");
		user2.addMiddleName("Patrick");
		user2.addMiddleName("Hugh");
		
		User user3 = new User();
		user3.setForename("Megan");
		user3.setSurname("Crouch");
		user3.setAge(22);
		user3.setEmail("megan@email.com");
		user3.setTelephoneNo("07775730253");
		user3.addMiddleName("Liz");
		user3.addMiddleName("Emily");
		
		List<User> listUser = new ArrayList<>();
		listUser.add(user1);
		listUser.add(user2);
		listUser.add(user3);
		
		for (User i : listUser) {
			System.out.println(i);
		}
	}

}
