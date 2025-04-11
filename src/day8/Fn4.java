package day8;

import java.util.Scanner;

// Series of prime number from 1 to n


public class Fn4 {

// create fn which check whether the number is prime or not
	static boolean checkPrime(int num) {
		boolean isPrime = true;
		
		if(num <=1) {
			isPrime = false;
		}
		
		// check number is prime or not
		for(int i = 2; i<= num-1;i++)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
	
	public static void main(String[] args) {
		// take input of n
		// and print series of prime number
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Number: ");
		n = sc.nextInt();
		
		if(n<=0) {
			System.err.println("To Display Prime Number Please Enter number greater than 1");
		}else {
			
			System.out.println("Series of prime number till " + n + " is: ");
			for (int i = 1; i <= n; i++) {
				boolean isPrime = checkPrime(i);

				if (isPrime) {
					System.out.print(i + " ");
				}
			}
		}
		
	}
}
