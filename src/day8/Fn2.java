package day8;

// Without return type with parameter
import java.util.Scanner;

public class Fn2 {

	// FUnction Definition
	static void multiplication(int a, int b) {
		
		
		int result = a * b;
		System.out.println("The multiplication of " + a + ", " + b + " = " + result);
	}

	public static void main(String[] args) {
		
		// Function Call
		multiplication(5,3);
		
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter 2 numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		multiplication(num1, num2);

	}

}
