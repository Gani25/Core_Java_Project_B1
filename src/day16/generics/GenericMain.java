package day16.generics;

import java.util.Scanner;

public class GenericMain {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numebrs: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n2 == 0)
		{
			ResponseClass<String> responseClass1 = new ResponseClass<>();
			responseClass1.setT("Cannot Divide By Zero");
			System.out.println(responseClass1);
		}
		else {
			
			int result = n1 / n2; // Exception
			
			ResponseClass<Integer> responseClass = new ResponseClass<>();
			responseClass.setT(result);
			System.out.println(responseClass);
		}
		
		
		
	}

}
