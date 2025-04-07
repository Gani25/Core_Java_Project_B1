package day2;

import java.util.Scanner;

public class Var2 {

	public static void main(String[] args) {
		// Take input from user
		
		Scanner sc = new Scanner(System.in); 
		int age;
		System.out.println("Enter age: ");
		age = sc.nextInt();
		System.out.println("Your age is: "+age);
		System.out.println("Enter large decimal number: ");
		
		double number = sc.nextDouble();
		System.out.println("Decimal number = "+number);
		
		System.out.println("Enter large non decimal number: ");
		long longNum = sc.nextLong();
		System.out.println("Long number = "+longNum);
		
		System.out.println("ENter chracter: ");
		char alp = sc.next().charAt(0);
		System.out.println("Alphabet = "+alp);

	}

}
