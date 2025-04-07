package day3;

import java.util.Scanner;

// WAP to check whether the number have 3 digit or not
public class If6 {
	
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Number: ");
		n = sc.nextInt();
//		>= 100 && <=999 -> Between 100 to 999
		if((n >=100 && n <=999) || (n<= -100 && n >= -999))
		{
			System.out.println("Number "+n+" have 3 digit");
		}else {
			
			System.out.println("Number "+n+" doesnot have 3 digit");
		}
	}

}
