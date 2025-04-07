package day4;

import java.util.Scanner;

// WAP to print sqare of first n natural numbers
// n = 5
// the square of 1 is 1
// the square of 2 is 4
// the square of 5 is 25
// start = 1, stop = n, gap = +1
public class Wh4 {

	public static void main(String[] args) {
		int i = 1; // start
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int square;
		while (i <= n) {
			square = i * i;
			System.out.printf("The square of %d is %d\n", i, square);
//			System.out.println("The square of " + i + " is " + square);
			i++;
		}
	}
}
