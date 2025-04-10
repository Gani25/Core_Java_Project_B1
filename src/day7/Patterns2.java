package day7;

import java.util.Scanner;

public class Patterns2 {

	public static void main(String[] args) {
		int n, i, j;

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter rows and columns: ");
		n = sc.nextInt();

		// ROWS
		for (i = n; i >= 1; i--) {
			
			// COLUMNS
			// n times
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
