package day5;

import java.util.Scanner;

// WAP To print first n natural numbers
public class For1 {
	
	public static void main(String[] args) {
		int i,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number: ");
		n = sc.nextInt();
		
		for(i = 1; i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
