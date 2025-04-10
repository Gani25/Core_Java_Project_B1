package day7;

import java.util.Scanner;

public class Patterns7 {

	public static void main(String[] args) {
		int n, i, j, sp;

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter rows and columns: ");
		n = sc.nextInt();

		// ROWS
		for (i = 1; i <= n; i++) {
			// space
			for (sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			// STARS
			for (j = 1; j <= 2 * i - 1; j++) {
				if (i == n || j == 1 || j == 2 * i - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
	}

}
