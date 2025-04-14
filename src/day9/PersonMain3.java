package day9;

import java.util.Scanner;

public class PersonMain3 {
	
	public static void main(String[] args) {
		// Reference Variable of Type Person.
		Scanner sc = new Scanner(System.in);
		Person2 p1 = new Person2();
	
		Person2 p2 = new Person2();
		p1.acceptInfo();
		p2.acceptInfo();
		
		p1.display();
		p2.display();
	}

}
