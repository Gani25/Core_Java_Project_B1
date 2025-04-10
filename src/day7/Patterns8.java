package day7;

import java.util.Scanner;

public class Patterns8 {

	public static void main(String[] args) {
		int n, i, j, sp;

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter rows and columns: ");
		n = sc.nextInt();

		// Upper Half
		// ROWS
		for (i = 1; i <= n; i++) {
			// space
			for (sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			// STARS
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// ROWS
		// LOWER HALF
		for (i = n-1; i >= 1; i--) {
			// space
			for (sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			// STARS
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
