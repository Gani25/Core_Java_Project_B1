package day10.classes;

import java.util.Scanner;

// COMBINING FIELDS AND METHODS
public class Person {
	
	// FIELDS
	private String name;
	
	private int age;
	
	private String gender;
	
	public Person(){
		// No args constructors
		System.out.println("Default Constructor Of Person Class");
		age = 50;
		name = "sprk tech";
		gender = "female";
	}
	
	public Person(int a,String n, String g){
		// All Args Constructor
		System.out.println("Parameterized Constructor Of Person Class");
		age = a;
		name = n;
		gender = g;
	
	}
		
	public void display()
	{
		System.out.println("--------------------------------------------");
		System.out.println("Person Info");
		System.out.println("Age = "+age);
		System.out.println("Name = "+name);
		System.out.println("Gender = "+gender);
	}

}
