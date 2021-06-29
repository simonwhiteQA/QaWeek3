package com.qa.community;

import java.util.ArrayList;
import java.util.List;

import com.qa.community.animal.Animal;
import com.qa.community.animal.Dog;
import com.qa.community.animal.Westie;

public class Runner {
	
public static void main(String[] args) {
		
	System.out.println("---Person Information---");
		Person person1 = new Person("Simon", 22, "SDET Trainee");
		Person person2 = new Person("Megan", 23, "Web Design");
		Person person3 = new Person("Niall", 24, "Python Level 3");
		Person person4 = new Person("Bob", 31, "SDET Specialist");
		Person person5 = new Person("Patrick", 19, "Tester");
		
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(person1);
		listPerson.add(person2);
		listPerson.add(person3);
		listPerson.add(person4);
		listPerson.add(person5);
		
		for (Person i : listPerson){
			i.printPerson();
		}
	
		
	System.out.println("\n---User Information---");
		User user1 = new User();
		user1.setForename("Simon");
		user1.setSurname("White");
		user1.setAge(22);
		user1.setEmail("simon@email.com");
		user1.setTelephoneNo("07775730253");
		user1.setMiddleName("John");
		user1.setMiddleName("Mark");
		
		User user2 = new User();
		user2.setForename("Niall");
		user2.setSurname("Duggan");
		user2.setAge(22);
		user2.setEmail("niall@email.com");
		user2.setTelephoneNo("07775730253");
		user2.setMiddleName("Patrick");
		user2.setMiddleName("Hugh");
		
		User user3 = new User();
		user3.setForename("Megan");
		user3.setSurname("Crouch");
		user3.setAge(22);
		user3.setEmail("megan@email.com");
		user3.setTelephoneNo("07775730253");
		user3.setMiddleName("Liz");
		user3.setMiddleName("Emily");
		
		List<User> listUser = new ArrayList<>();
		listUser.add(user1);
		listUser.add(user2);
		listUser.add(user3);
		
		for (User i : listUser) {
			System.out.println(i);
		}
		
		System.out.println("\n---Animal Methods---");
		Animal d1 = new Dog(); //create new dog as a animal
		d1.setAge(8);
		d1.setBreed("Westie");
		d1.setColour("White");
		d1.setName("Jaida");
		
		Dog d2 = new Dog(); // create new dog in class dog
		d2.setAge(8);
		d2.setBreed("Westie");
		d2.setColour("White");
		d2.setName("Mya");
		d2.dogWoof(d2.getName()); //called from dog class
		
		Dog d3 = new Westie();
		d3.setName("Jess");
		d3.dogWoof(d3.getName()); //called from override in westie class
		
		List<Animal> listAnimals = new ArrayList<>();
		listAnimals.add(d1);
		listAnimals.add(d2);
		listAnimals.add(d3);
		
		System.out.println("\n---Print from list in loop---");
		for (Animal i : listAnimals) {
			System.out.println(i);
			
		}
	}

}
