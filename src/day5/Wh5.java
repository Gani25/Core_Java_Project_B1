package day5;

import java.util.Scanner;

//WAP to print factorial of n 
//n = 5
//5 * 4 * 3 * 2 * 1 = 120
public class Wh5 {

	public static void main(String[] args) {

		int n, fact = 1, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();

		i = n;

		while (i >= 1) {
			fact = fact * i;
			i--;
		}

		System.out.println("The factorial of " + n + " is " + fact);

	}

}
