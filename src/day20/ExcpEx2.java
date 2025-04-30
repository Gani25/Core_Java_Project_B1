package day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcpEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, res;
		String num;
		
		
		try {
			System.out.println("Enter number 1: ");
			num = sc.next();
			n1 = Integer.parseInt(num);
			System.out.println("Enter number 2: ");
			n2 = sc.nextInt();
			
			res = n1 / n2;
			// Either success or throw Arithmatic Excption
			System.out.println("Division is: "+res);
			
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("Cannot Divide By Zero");
		}catch(InputMismatchException ime) {
//			System.out.println(ime.getMessage());
			
			System.out.println("Please enter number only");	
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Hello outside");
	}

}
