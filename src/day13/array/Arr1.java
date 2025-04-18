package day13.array;

import java.util.Scanner;

public class Arr1 {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int i;
		
		for(i = 0; i<arr.length;i++) {
			System.out.println("Enter element at position "+i+": ");
			
			arr[i] = sc.nextInt();
			
		}
		
		// display
		System.out.println("Elements are: ");
		for(i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
