package day4;

import java.util.Scanner;

// WAP to print sum of first n natural number
// n = 5 -> 1 + 2 + 3 + 4 + 5 -> 15
// start = 1, stop = n, gap = +1
public class Wh3 {

	public static void main(String[] args) {
		int i=1; // start
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int sum = 0; 
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of first "+n+" natural number is: "+sum);
	}
}
