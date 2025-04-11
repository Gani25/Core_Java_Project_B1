package day8;

// Create a function which return true or false based on
// Even or odd


public class Fn3 {
	// with return type with parameter
	static boolean checkEvenOrOdd(int num) {
		
		return num % 2 == 0;
		
	}
	
	public static void main(String[] args) {
		boolean result = checkEvenOrOdd(5);
		
		System.out.println(result);
		
		System.out.println(checkEvenOrOdd(10));
	}
}
