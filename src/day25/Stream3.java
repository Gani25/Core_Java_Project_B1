package day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream3 {
	
	public static void main(String[] args) {
		// convert stream of object into arrays
		
		List<Integer> nums = new ArrayList<>();
		
		nums.addAll(Arrays.asList(50,60,1,30,8,9));
		
		System.out.println(nums);
		
		Integer[] intArr=nums.stream().toArray(Integer[]::new);
		
		System.out.println(intArr);
		
//		String[] strArr = nums.stream()
//				.map(e->String.valueOf(e))
//				.toArray(String[]::new);
	

		String[] strArr = nums.stream()
				.map(String::valueOf)
				.toArray(String[]::new);
		System.out.println(strArr);
		
		for(String e: strArr) {
			System.out.println(e);
		}
		
		// foreach
		System.out.println("For Each Using Scope Operator");
		nums.forEach(System.out::println);
	}

}
