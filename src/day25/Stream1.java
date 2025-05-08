package day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {

		// filter
		List<Integer> numbers = new ArrayList<>();

		numbers.addAll(Arrays.asList(5, -6, 10, 25, 35, -8, 60, -5, 2, -99));

		System.out.println(numbers);

		// Remove all the negative enteries from List of Nums
		List<Integer> positiveNums = numbers.stream().filter((e) -> (e > 0)).toList();

		System.out.println(positiveNums);
		
		// For All -ve number do square
		
		List<Integer> squareNegNums= numbers.stream().filter(e->e<0).map(e -> e*e).toList();

		System.out.println(squareNegNums);
		
		
	}
}
