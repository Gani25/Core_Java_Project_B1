package day10.classes;

import java.util.Scanner;

// COMBINING FIELDS AND METHODS
public class Person3 {
	
	// FIELDS
	private String name;
	
	private int age;
	
	private String gender;
	
	public Person3(){
		// No args constructors
		System.out.println("Default Constructor Of Person Class");
		age = 50;
		name = "sprk tech";
		gender = "female";
	}
	
	public Person3(int age,String name, String gender){
		// All Args Constructor
		System.out.println("Parameterized Constructor Of Person Class");
		this.age = age;
		this.name = name;
		this.gender = gender;
	
	}
		
	// Getters 
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	// Setters-> Used to modify private and protected fields of class
	// normal functions
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
