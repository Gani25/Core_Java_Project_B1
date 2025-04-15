package day10;

import day10.classes.Person2;
import day10.classes.Person3;

public class PersonMain3 {

	public static void main(String[] args) {
		Person3 p1 = new Person3();
		
		System.out.println("Name: "+p1.getName());
		System.out.println("Age: "+p1.getAge());
		System.out.println("Gender: "+p1.getGender());
		
		p1.setAge(20);
		p1.setGender("Female");
		p1.setName("Pranjal");
		
		System.out.println("After Setter Called");
	
		System.out.println("Name: "+p1.getName());
		System.out.println("Age: "+p1.getAge());
		System.out.println("Gender: "+p1.getGender());
		
	}
}
