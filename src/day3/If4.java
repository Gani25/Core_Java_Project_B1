package day3;

import java.util.Scanner;

// WAP to accept a number
/*
 * CHeck number is divisible by 3 and 5 both
 * Only diviisible by 3
 * only divisible by 5
 * not divisible by any
 * */
public class If4 {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Number: ");
		n = sc.nextInt();

		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("Number " + n + " is divisible by both 3 and 5");
		} else if (n % 3 == 0) {
			System.out.println("Number " + n + " is divisible by 3");
		} else if (n % 5 == 0) {
			System.out.println("Number " + n + " is divisible by 5");
		} else {

			System.out.println("Number " + n + " is not divisible by 3 and 5");
		}
	}

}
