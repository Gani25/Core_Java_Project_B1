package day24;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SetEx1 {

	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();

		mySet.add("Hello");
		mySet.add("007");
		mySet.add("Hello");
		mySet.add("Virat");
		mySet.add("Abdul");
		mySet.add("Abdul");
		mySet.add("Rohan");
		mySet.add("Shruti");

		System.out.println(mySet);

		mySet.remove("Hello");

		mySet.add("Demo");

		System.out.println(mySet);

		Set<Integer> nums = new TreeSet<>();
		nums.add(5);
		nums.add(-5);
		nums.add(2);
		nums.add(55);
		nums.add(512);
		nums.add(50);
		nums.add(5);
		nums.add(50);
		nums.add(-85);
		nums.add(50);
		nums.add(0);
		nums.add(-850);
		nums.add(-950);

		System.out.println(nums);

		nums.removeIf((element) -> element < 0);
		
		// Predicate -> boolean
		System.out.println(nums);
		
		System.out.println("Looping over set and squaring the element");
		// Consumer -> void Write Logic
		nums.forEach((elem)->System.out.println(elem * elem));
	}

}
