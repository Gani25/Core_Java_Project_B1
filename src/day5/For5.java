package day5;
// WAP to print sum of 1 to n
// 1 + 2 + 3 + .. + n

import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, sum = 0;

		System.out.println("Number: ");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of 1 to "+ n+ " is "+sum);
	}
}

// WAP to print table of n
//WAP to print square of 1 to n
