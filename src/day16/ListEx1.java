package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();

		System.out.println(fruits);

		System.out.println("Is my refrigerator Empty or Not? " + fruits.isEmpty());

		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Mango");
		System.out.println(fruits);

		fruits.add(1, "Papaya");
		System.out.println(fruits);
		fruits.addLast("Peru");
		fruits.addFirst("Peru");
		System.out.println(fruits);

		System.out.println("Length of Fruits is: " + fruits.size());

		List<String> basketFruit = Arrays.asList("Litchi", "Watermellon", "Apple");

		fruits.addAll(basketFruit);
		System.out.println(fruits);

		fruits.addAll(2, basketFruit);
		System.out.println(fruits);
		System.out.println("Length of Fruits is: " + fruits.size());

		System.out.println(fruits.getFirst());
		System.out.println(fruits.getLast());
		System.out.println(fruits.get(3));

		System.out.println(fruits.indexOf("Papaya"));

		System.out.println(fruits.get(fruits.indexOf("Papaya")));

	}

}
