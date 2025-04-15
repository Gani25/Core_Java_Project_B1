package day10.classes;

import java.util.Scanner;

// COMBINING FIELDS AND METHODS
public class Person2 {
	
	// FIELDS
	private String name;
	
	private int age;
	
	private String gender;
	
	public Person2(){
		// No args constructors
		System.out.println("Default Constructor Of Person Class");
		age = 50;
		name = "sprk tech";
		gender = "female";
	}
	
	public Person2(int age,String name, String gender){
		// All Args Constructor
		System.out.println("Parameterized Constructor Of Person Class");
		this.age = age;
		this.name = name;
		this.gender = gender;
	
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
