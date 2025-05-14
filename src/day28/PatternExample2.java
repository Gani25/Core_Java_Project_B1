package day28;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternExample2 {
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		System.out.println("Regex Metacharacters ");
		System.out.println("--------------------------------------");
		
		/*
		 * \d -> digits [0-9]
		 * \D -> Any non digit characters -> not of digit [a-zA-Z]
		 * \s -> white space 
		 * \S -> exclude spaces
		 * \w -> [A-Za-z0-9_]
		 * */
		
		System.out.println("Enter a number to check whether the number is even or odd: ");
		Scanner sc = new Scanner(System.in);
		
		String numStr = sc.nextLine();
		
		if(Pattern.matches("^\\d+$", numStr))
		{
			int num = Integer.parseInt(numStr);
			if(num % 2 == 0)
			{
				System.out.println("Number: "+num+" is even number!");
			}else {
				System.out.println("Number: "+num+" is odd number!");
				
			}
		}else {
			System.out.println("Please enter number only to check even or odd!!");
		}
		
		
		
		
		
//		InputMismatchException if we pass any character in integer
//		System.out.println("Enter a number to check whether the number is even or odd: ");
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		if(num % 2 == 0)
//		{
//			System.out.println("Number: "+num+" is even number!");
//		}else {
//			System.out.println("Number: "+num+" is odd number!");
//			
//		}
	}

}
