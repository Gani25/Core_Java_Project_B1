package day3;

import java.util.Scanner;

/*WAP to check whether the triangle is equilateral, or isoceles, or scalene*/
public class If5 {

	public static void main(String[] args) {
		int s1,s2,s3;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENter 3 sides of a triangle: ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
//		NESTED IF ELSE
		if(s1 > 0 && s2 > 0 && s3 > 0) {
			
			if(s1 == s2 && s2 == s3)
			{
				System.out.println("Equilateral");
			}
			else if (s1 == s2 || s2 == s3 || s1 == s3)
			{
				System.out.println("Isoceles");
			}else {
				
				System.out.println("Scalene");
			}
		}else {
			System.out.println("Invalid Triangle");
			
		}
	}
}
