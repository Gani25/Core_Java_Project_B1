package day3;

import java.util.Scanner;

//WAP TO check whther the number is positive or negative
public class If1 {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter a number: ");
		n = sc.nextInt();
//		CTRL + SHIFT + F -> AUTO FORMAT
		if (n >= 0) {
			System.out.println("Number " + n + " is a positive number");
		} else {

			System.out.println("Number " + n + " is a negative number");
		}
	}

}
