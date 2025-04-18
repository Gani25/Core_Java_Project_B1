package day13.array;

import java.util.Scanner;

public class Arr3 {

	public static void displayArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

//	WAP to accept array and then accept a position and insert new element
//	in that position
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enter size of array: ");
		n = sc.nextInt();

		int[] arr = new int[n];

		int i;
		for (i = 0; i < n; i++) {
			System.out.println("Enter element at position " + i + ": ");

			arr[i] = sc.nextInt();

		}

		// display
		System.out.println("Elements are: ");
		displayArr(arr);
		
		System.out.println("\nEnter position to insert new element");
		int position = sc.nextInt();
		System.out.println("Enter new element");
		int newElement = sc.nextInt();
		
		int[] newArray = new int[n+1];
		
		int j = 0;
		for(i = 0;i<newArray.length;i++) {
			if(i == position-1) {
				
				newArray[i] = newElement;
				
			}else {
				newArray[i] = arr[j];
				j++;
			}
		}
		
		System.out.println("Elements after inserting new data: ");
		displayArr(newArray);
		
		

	}

}
