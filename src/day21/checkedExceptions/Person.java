package day21.checkedExceptions;

import java.util.Scanner;

public class Person {

	private int age;
	private double salary;

	void acceptAge() throws AgeInvalidException, SalaryInvalidException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter your salary: ");
		salary = sc.nextDouble();

		if (age < 0) {
			throw new AgeInvalidException("Age cannot be negative");
		}
		if(salary < 0.0) {
			throw new SalaryInvalidException("Salary cannot be below zero");
		}

	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}

}
