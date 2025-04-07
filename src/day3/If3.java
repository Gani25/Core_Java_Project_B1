package day3;

import java.util.Scanner;

//WAP to check whether greatest of 2 numbers
// Input = 2
public class If3 {

	public static void main(String[] args) {
		int n1, n2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("N1: " + n1 + " is greater than N2: " + n2);
		} else if (n2 > n1) {
			System.out.println("N2: " + n2 + " is greater than N1: " + n1);

		} else {
			System.out.println("Both are equal");
		}
	}
}
