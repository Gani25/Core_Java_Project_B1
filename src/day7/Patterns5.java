package day7;

import java.util.Scanner;

public class Patterns5 {

	public static void main(String[] args) {
		int n, i, j;

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter rows and columns: ");
		n = sc.nextInt();

		// ROWS
		for (i = 1; i <= n; i++) {
			
			// COLUMNS
			// n times
			for(j=1;j<=n;j++)
			{
				if(i==1 || i == n ||j == 1||j==n)
				{
					
					System.out.print("* ");
				}else {
					System.out.print("  ");
					
				}
			}
			System.out.println();
		}
	}

}
