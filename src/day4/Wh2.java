package day4;

import java.util.Scanner;

//First n natural number in reverse order
//n ... 3 2 1
//start = n, stop = 1, gap = -1 
public class Wh2 {

	public static void main(String[] args) {
		int i;// start (n user input) NOT KNOWN
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		n = sc.nextInt();
		i = n; // start
		System.out.println("First " + n + " natural numbers in reverse order are: ");
		while (i >= 1) {
			System.out.print(i + " ");
			// inc /dec
			i--;
		}
	}
}
