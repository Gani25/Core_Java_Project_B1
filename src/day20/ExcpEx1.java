package day20;

import java.util.Scanner;

public class ExcpEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, res;
		
		System.out.println("Enter 2 numbers: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		res = n1 / n2;
		
		System.out.println("Enter a number: ");
		String number = sc.next();
		
		int num = Integer.parseInt(number);
		
		System.out.println("Integer number is: "+num);
		
		System.out.println("Division is: "+res);
		
		System.out.println("Thanks for using Bye!!");
		
		String name = null;
		
		System.out.println(name.length() > 0);
	}

}
