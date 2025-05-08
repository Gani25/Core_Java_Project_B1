package day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream2 {

	public static void main(String[] args) {
		List<Integer> percentages = new ArrayList<>();
		
		percentages.addAll(Arrays.asList(55,98,65,32,29,88,20,23,60));
		
		// Count number of student who have pass > 35
		
		long passStudentCount = percentages.stream().filter(mark -> mark >=35).count();
		
		System.out.println(passStudentCount);
		
		Comparator<Integer> c = (e1,e2)->e2-e1;
		// Sort All Percent By Desc
		
		List<Integer> descPercentages = percentages.stream().sorted(c).toList();
		
		System.out.println(descPercentages);
		// Find Maximum Percent
		
		Comparator<Integer> c2 = (e1,e2)->Integer.compare(e1, e2);
		int maxPercent = percentages.stream().max(c2).get();
		
		System.out.println(maxPercent);
		int minPercent = percentages.stream().min(c2).get();
		
		System.out.println(minPercent);
		
	
	}
}
