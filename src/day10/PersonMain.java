package day10;

import day10.classes.Person;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Person p3 = new Person(25,"Abdul Gani","Male");
		
		p1.display();
		p2.display();
		p3.display();
		
	}
}
