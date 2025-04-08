package day5;
// WAP to print factorial of n

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, fact = 1;

		System.out.println("Number: ");
		n = sc.nextInt();

		for (i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("The factorial of "+ n+ " is "+fact);
	}
}

