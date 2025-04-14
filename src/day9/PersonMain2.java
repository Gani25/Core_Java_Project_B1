package day9;

import java.util.Scanner;

public class PersonMain2 {
	
	public static void main(String[] args) {
		// Reference Variable of Type Person.
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("Enter name: ");
		p1.name = sc.nextLine();
		System.out.println("Enter age: ");
		p1.age=sc.nextInt();
		System.out.println("Enter gender: ");
		p1.gender = sc.next();
		
		sc.nextLine();
		
		Person p2 = new Person();
		System.out.println("---------------------------------");
		System.out.println("\nEnter name: ");
		p2.name = sc.nextLine();
		
		System.out.println("Enter age: ");
		p2.age = sc.nextInt();
		
		System.out.println("Enter gender: ");
		p2.gender = sc.next();
		 
		System.out.println("Person Info");
		System.out.println("Age = "+p1.age);
		System.out.println("Name = "+p1.name);
		System.out.println("Gender = "+p1.gender);
		
		System.out.println("Person Info");
		System.out.println("Age = "+p2.age);
		System.out.println("Name = "+p2.name);
		System.out.println("Gender = "+p2.gender);
	}

}
