package day6;

import java.util.Scanner;

//WAP to check whther the nunber is palindrome or not
//1881 -> 1881
//1534 -> 4351
public class For8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,reverse = 0,remainder;
		
		System.out.println("Enter a nuymber: ");
		n = sc.nextInt();
		
		i = n;
		while(i!=0)
		{
			remainder = i % 10;
			// reverse
			reverse = (reverse * 10) + remainder;
			// decrement
			i = i / 10;
		}
		
		if(n == reverse) {
			System.out.println("Number "+n+" is palindrome");
		}else {
			System.out.println("Number = "+n+", Reverse = "+reverse+" is not palindrome");
			
		}
	}
}
