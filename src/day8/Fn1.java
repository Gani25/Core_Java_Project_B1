package day8;

import java.util.Scanner;

public class Fn1 {

	// FUnction Definition
	static void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter 2 numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int result = n1 + n2;
		System.out.println("The addition of " + n1 + ", " + n2 + " = " + result);
		
		multiplication(n1, n2);
	}

	// FUnction Definition
	static void multiplication(int a, int b) {

		int result = a * b;
		System.out.println("The multiplication of " + a + ", " + b + " = " + result);
	}

	public static void main(String[] args) {

		// Function Call
		addition();
		addition();

	}

}
