package day9;

import java.util.Scanner;

// COMBINING FIELDS AND METHODS
public class Person2 {
	
	// FIELDS
	String name;
	
	int age;
	
	String gender;
	
	void acceptInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n------------------------------------------");
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		System.out.println("Enter gender: ");
		gender = sc.next();
		
	}
	
	void display()
	{
		System.out.println("--------------------------------------------");
		System.out.println("Person Info");
		System.out.println("Age = "+age);
		System.out.println("Name = "+name);
		System.out.println("Gender = "+gender);
	}

}
