package day28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PetternExample {
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("^[abc]$");
		Matcher matcher = pattern.matcher("a");
		
		System.out.println(matcher.matches());
		
		
		System.out.println("--------------------------------------");
		System.out.println("Regular Expression Characters");
		System.out.println("--------------------------------------");
		
		System.out.println("Pattern.matches(\"^[abc]$\", \"a\") -> " +Pattern.matches("^[abc]$", "a"));
		System.out.println("Pattern.matches(\"^[abc]$\", \"abc\") -> " +Pattern.matches("^[abc]$", "abc"));
		System.out.println("Pattern.matches(\"^[abc]$\", \"hallo\") -> " +Pattern.matches("^[abc]$", "hallo"));
		
		
		System.out.println("Pattern.matches(\"^[abc]$\", \"A\") -> " +Pattern.matches("^[abc]$", "A"));
		System.out.println("Pattern.matches(\"^[abcABC]$\", \"A\") -> " +Pattern.matches("^[abcABC]$", "A"));
		System.out.println("Pattern.matches(\"^[a-zA-Z]$\", \"J\") -> " +Pattern.matches("^[a-zA-Z]$", "J"));
		System.out.println("Pattern.matches(\"^[0-9]$\", \"5\") -> " +Pattern.matches("^[0-9]$", "5"));
		
		System.out.println("--------------------------------------");
		System.out.println("Regex Quantifiers");
		System.out.println("--------------------------------------");
		
		System.out.println("Pattern.matches(\"^A?$\", \"Abdul\") -> " +Pattern.matches("^A?$", "Abdul"));
		System.out.println("Pattern.matches(\"^A?$\", \"A\") -> " +Pattern.matches("^A?$", "A"));
		System.out.println("Pattern.matches(\"^A?$\", \"BCD\") -> " +Pattern.matches("^A?$", "BCD"));
		System.out.println("Pattern.matches(\"^A?$\", \"AAA\") -> " +Pattern.matches("^A?$", "AAA"));
		System.out.println("Pattern.matches(\"^A+$\", \"AAA\") -> " +Pattern.matches("^A+$", "AAA"));
		System.out.println("Pattern.matches(\"^[A-Z]+$\", \"BBBB\") -> " +Pattern.matches("^[A-Z]+$", "BBBB"));
		System.out.println("Pattern.matches(\"^[a-zA-Z]+$\", \"Abdul\") -> " +Pattern.matches("^[a-zA-Z]+$", "Abdul"));
		System.out.println("Pattern.matches(\"^[a-zA-Z]+$\", \"Abdul12\") -> " +Pattern.matches("^[a-zA-Z]+$", "Abdul12"));
		
		System.out.println("Pattern.matches(\"^[0-9]{10}$\", \"1234\") -> " +Pattern.matches("^[0-9]{10}$", "1234"));
		System.out.println("Pattern.matches(\"^[0-9]{10}$\", \"1234123412\") -> " +Pattern.matches("^[0-9]{10}$", "1234123412"));
		System.out.println("Pattern.matches(\"^[0-9]{5,}$\", \"12345\") -> " +Pattern.matches("^[0-9]{5,}$", "12345"));
		System.out.println("Pattern.matches(\"^[0-9]{2,5}$\", \"1\") -> " +Pattern.matches("^[0-9]{2,5}$", "1"));
		System.out.println("Pattern.matches(\"^[0-9]{2,5}$\", \"222\") -> " +Pattern.matches("^[0-9]{2,5}$", "222"));
		
		
		
		
		
		
	}

}
