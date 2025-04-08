package day5;

import java.util.Scanner;

// WAP to print odd sum and even sum of number from 1 to n using 1 loop
// n = 10
// oddSum = 1 + 3 + 5 + 7 + 9 = 25
// evenSum = 2 + 4 + 6 + 8 + 10 = 30
public class Wh7 {

	public static void main(String[] args) {
		int i = 1, n, evenSum = 0, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		n = sc.nextInt();
		while (i <= n) {
			if (i % 2 == 0) {
				// even
				evenSum = evenSum + i;
			} else {
				// odd
				oddSum = oddSum + i;
			}
			
			i++;
		}
		
		System.out.println("The sum of only odd number from 1 to "+ n+" is "+oddSum);
		System.out.println("The sum of only even number from 1 to "+ n+" is "+evenSum);

	}

}
