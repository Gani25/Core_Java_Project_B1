package day28;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternExample3 {
	
	public static void main(String[] args) {
		String phone;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter phone number in format (+222 12345 58956)");
		
		phone = sc.nextLine();
		
//		String regex = "^\\+{1}\\d{1,5} \\d{5} \\d{5}$";

		//		String regex = "^\\+\\d{1,4}[- ]?(\\(\\d{3,5}\\)|\\d{3,5})[- ]?\\d{3,5}[- ]?\\d{3,5}$";

		String regex = "^(\\+\\d{1,5} \\d{5} \\d{5}|\\d{10}|\\d{5} \\d{5})$";

		System.out.println(Pattern.matches(regex, phone));
	
		// Pattern for password
//		min length 8 -> contains upper, lower, special, digits
	}

}
