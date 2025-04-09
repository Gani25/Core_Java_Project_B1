package day6;

import java.util.Scanner;

//CHeck prime or not
// DIvisible by one and by its own
public class For9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,i;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		// Assumption Any Value of n is a prime number
		boolean isPrime = true;
		if(n<=1) {
			isPrime = false;
		}
		
		for(i=2;i<=n-1;i++)
		{
			if(n % i == 0)
			{
				// not prime
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Nyumber: "+n+" is a prime number");
		}else {
			System.out.println("Nyumber: "+n+" is not a prime number");
			
		}
		
		
	}

}
