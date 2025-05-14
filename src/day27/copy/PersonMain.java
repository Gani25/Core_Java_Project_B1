package day27.copy;

public class PersonMain {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 25;
		p1.name= "Abdul Gani";
		p1.gender = "Male";
		
		Person p2 = p1;
		
		System.out.println("Person 1 -> "+p1);
		System.out.println("Person 2 -> "+p2);
		
		System.out.println(p1 == p2);
		
		p2.name = "Pranjal Gupta";
		p2.gender = "Female";
		
		System.out.println("Person 1 -> "+p1);
		System.out.println("Person 2 -> "+p2);
	}

}
