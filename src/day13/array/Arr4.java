package day13.array;

public class Arr4 {

	public static void displayArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 9, 6, 3, 4, 8, 10, 7 };
		
		int evenCount = 0, oddCount = 0;
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		int[] evenArr = null;
		int[] oddArr = null;
		if(evenCount>0) {
			evenArr = new int[evenCount];
		}
		if(oddCount>0) {
			oddArr = new int[oddCount];
		}
		int j;
		int k;
		for(j = 0,k = 0,i=0;i<arr.length;i++) {
			
			if(arr[i]%2 == 0) {
				evenArr[k] = arr[i];
				k++;
			}else {
				oddArr[j] = arr[i];
				j++;
			}
		}
		
		System.out.println("\nElements are: ");
		displayArr(arr);
		System.out.println("\nOdd Elements are: ");
		displayArr(oddArr);
		System.out.println("\nEven Elements are: ");
		displayArr(evenArr);
	}
}
