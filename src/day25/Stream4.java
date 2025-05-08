package day25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream4 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rohit","Rohan","Shobit","Zero","Ashwin","Abdul","DE","SHE");
		System.out.println(names);
		
		System.out.println(names.stream().sorted().toList());
		System.out.println(names.stream().sorted(Comparator.reverseOrder()).toList());
		
		List<String> sortedList = names
				.stream()
				.sorted((e1,e2)->{
					int lenCompare = Integer.compare(e1.length(), e2.length());
					if(lenCompare == 0) {
						return e1.compareTo(e2);
					}
					return lenCompare;
					}).toList();
		System.out.println(sortedList);
				
	}

}
