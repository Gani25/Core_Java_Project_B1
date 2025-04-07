package day4;

import java.util.Scanner;

// CHeck whther the character is vowel or consonant
public class Sw2 {
	public static void main(String[] args) {
		char alph;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENter a character: ");
		
		alph = sc.next().charAt(0);
		
		switch(alph) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		
		}
	}

}
