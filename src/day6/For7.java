package day6;

import java.util.Scanner;

//WAP to print sum of digit of n
//n = 153 -> 3 + 5 + 1 = 9
public class For7 {

	public static void main(String[] args) {
		int i, n, sum = 0, remainder;

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number: ");
		n = sc.nextInt();

		i = n;

		while (i != 0) {
			remainder = i % 10;
			sum = sum + remainder;
			i = i / 10; // descrement
		}
		System.out.println("The sum of digit of "+n+" is "+sum);

	}

}
