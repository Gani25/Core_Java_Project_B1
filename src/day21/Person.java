package day21;

import java.util.Scanner;

public class Person {
	
	private int age;
	
	void acceptAge() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		if(age < 0) {
			throw new AgeInvalidException("Age cannot be negative");
		}
		
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
	

}
