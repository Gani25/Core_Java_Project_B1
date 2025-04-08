package day5;

import java.util.Scanner;

//FIZZBUZZ
// 1 to n
/*
 * Criteria
 * num is divisible by 3 -> FIZZ
 * num is divisible by 5 -> BUZZ
 * num is divisible by 3 and 5 -> FIZZBUZZ
 * not divisible -> num
 * */
public class Wh6 {

	public static void main(String[] args) {

		int n, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();

		while (i <= n) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (i % 3 == 0) {
				System.out.println("FIZZ");
			} else if (i % 5 == 0) {
				System.out.println("BUZZ");
			} else {
				System.out.println(i);
			}
			i++;
		}

	}

}
