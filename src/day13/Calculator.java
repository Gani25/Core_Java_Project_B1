package day13;

import java.util.Scanner;

public class Calculator {

	public void addition() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		System.out.println("Addition with 2 integer without paramaters: " + n1 + " + " + n2 + " = " + (n1 + n2));
	}

	public void addition(int n1, int n2) {

		System.out.println("Addition with 2 integer as paramaters: " + n1 + " + " + n2 + " = " + (n1 + n2));
	}

	public void addition(int n1, int n2, int n3) {

		System.out.println("Addition with 3 integer: " + n1 + " + " + n2 + "+ " + n3 + " = " + (n1 + n2 + n3));
	}

	public void addition(double n1, int n2) {

		System.out.println("Addition with 2 decimal numbers: " + n1 + " + " + n2 + " = " + (n1 + n2));
	}
}
