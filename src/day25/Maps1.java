package day25;

import java.util.TreeMap;
import java.util.Map;

public class Maps1 {
	
	public static void main(String[] args) {
		// Key : Value -> Pair
		// Contact Book -> Name Key: Mobile Number Value
		// Key unique
		
		Map<String, Integer> contacts = new TreeMap<>();
		
		contacts.put("Rohan", 1234);
		contacts.put("Ayush", 5485);
		contacts.put("Abdul", 2222);
		contacts.put("Pranjl", 2020);
		contacts.put("Soham", 3256);
		contacts.put("Rohan", 58555);
		
		System.out.println(contacts);

		contacts.put("Ayush", 66555);
		
		System.out.println(contacts);
		
		contacts.putIfAbsent("Shivani", 147444);
		contacts.putIfAbsent("Ayush", 666666);
		System.out.println(contacts);
		contacts.remove("Rohan");
		
		System.out.println("After Remove");
		System.out.println(contacts);
		
		contacts.replace("Shivani", 1000000);
		contacts.replace("Abdul", 1000000);
		System.out.println(contacts);
//		BiCOnsumer -> Key Value (Type)
		contacts.forEach((k,v)->System.out.println("Name = "+k+" - "+v));
		
		System.out.println(contacts.containsKey("Abdul"));
		System.out.println(contacts.containsKey("Shivani"));
		
		contacts.replace("Shivani", 15488, 4545);
		
		System.out.println(contacts);
		
		System.out.println(contacts.get("Ayush"));
		
		for(String key : contacts.keySet()) {
			System.out.println(key +" - "+ contacts.get(key));
		}
		
		System.out.println(contacts.size());
		
		
	}

}
