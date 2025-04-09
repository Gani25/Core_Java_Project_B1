package day6;

import java.util.Scanner;

//WAP to print table of n till x iterations
public class For6 {
	
	public static void main(String[] args) {
		int n,x,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		
		System.out.println("Enter number of iterations: ");
		x = sc.nextInt();
		
		for(i = 1; i<=x;i++)
		{
			System.out.println(n+" x "+i+" = " + (n*i));
		}
	}

}
