package day6;

import java.util.Scanner;

//WAP to print fibonacci series till n
// n = 10
// 0 1 1 2 3 5 8 13 21 34
public class For10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, i, n1 = 0, n2 = 1, n3;
		System.out.println("Enter iterations: ");
		n = sc.nextInt();

		System.out.print(n1 + " " + n2 + " ");
		for (i = 3; i <= n; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}

	}

}
