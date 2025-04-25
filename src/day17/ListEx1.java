package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEx1 {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(50);
		numbers.add(6);
		numbers.add(-6);
		numbers.add(2);
		numbers.add(50);
		numbers.add(4);
		numbers.add(-6);
		numbers.add(25);
		numbers.add(5);
		System.out.println(numbers);
		System.out.println(numbers.remove(0));
		System.out.println(numbers);
		
		numbers.removeAll(Arrays.asList(4,-6,25));
		System.out.println(numbers);
		
		System.out.println("Looping Over List: ");

		for(int i = 0; i< numbers.size();i++)
		{
			System.out.print( numbers.get(i)+" ");
		}
		
		System.out.println("\nEnhanced For Loop");
		
		for(int element:numbers) {
			System.out.print( element+" ");
			
		}
		
		System.out.println( "\n"+numbers.contains(50));
		System.out.println( numbers.contains(5000));
		
		System.out.println( numbers.containsAll(Arrays.asList(50,2,600)));
		
		
		System.out.println("Element 6 found at position: "+numbers.indexOf(6));
		numbers.add(5);
		numbers.add(60);
		numbers.add(6);
		numbers.add(8);
		numbers.add(6);
		
		System.out.println(numbers);
		System.out.println("Element 6 found at position: "+numbers.indexOf(6));
		System.out.println("Element 6 found at position: "+numbers.lastIndexOf(6));
		
		numbers.remove(numbers.lastIndexOf(6));
		
		System.out.println(numbers);
		
		System.out.println( numbers.set(1, 200));
		System.out.println(numbers);

		numbers.sort(null);
		
		System.out.println("Sort In Asc: ");
		
		System.out.println("After sort in ASC: "+numbers);
		
		List<Integer> reversed = numbers.reversed();
		System.out.println("List In Reverse Order: "+reversed);
		
		System.out.println("Sort In Desc: ");
		List<Integer> numbersList = new ArrayList<>();
		
		numbersList.addAll(Arrays.asList(50,-2,-6,35,500,50,310,240,310,35));
		
		System.out.println("Numbers List Before Sorting In Desc: ");
		System.out.println(numbersList);
		numbersList.sort(Collections.reverseOrder());
		System.out.println("Numbers List After Sorting In Desc: ");
		System.out.println(numbersList);
		
	
		
	}

}
