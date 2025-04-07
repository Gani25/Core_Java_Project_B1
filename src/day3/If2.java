package day3;

import java.util.Scanner;

//WAP TO check whther the number is even or odd
//Dividie by 2 and remainder is 0 -> EVEN
public class If2 {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter a number: ");
		n = sc.nextInt();
//		CTRL + SHIFT + F -> AUTO FORMAT
		if (n%2 == 0) {
			System.out.println("Number " + n + " is even number");
		} else {

			System.out.println("Number " + n + " is odd number");
		}
	}
}
// WAP to check whether the number is zero or non zero
