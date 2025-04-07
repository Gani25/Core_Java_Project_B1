package day4;

import java.util.Scanner;

// WAP to print first n natural numbers.
// 1 2 3 ... n
//start = 1, stop = n, step/gap = +1
public class Wh1 {
	
	public static void main(String[] args) {
		int i = 1;
		int n;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		System.out.println("First "+n+" natural numbers are: ");
		while(i<=n) {
			System.out.print(i+"\t");
			// inc /dec
			i++; // i = i + 1
		}
	}
	
//	First n natural number in reverse order
//	n ... 3 2 1
// start = n, stop = 1, gap = -1 

}
