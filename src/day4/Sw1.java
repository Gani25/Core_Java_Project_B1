package day4;

import java.util.Scanner;

public class Sw1 {
	
//	WAP to print day of week ask by user
	public static void main(String[] args) {
		int dayNumber;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENter day number: ");
		dayNumber = sc.nextInt();
		
		switch(dayNumber) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Pls slct from 1 to 7");
		}
		
		
	}
	

}
