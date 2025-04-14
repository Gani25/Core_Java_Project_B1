package day9;

public class PersonMain {
	
	public static void main(String[] args) {
		// Reference Variable of Type Person.
		Person p1 = new Person();
		
		p1.name="Rohan Yadav";
		p1.age = 25;
		p1.gender = "Male";
		
		Person p2 = new Person();
		p2.gender = "Female";
		p2.age = 45;
		p2.name="Pranjal Yadav";
		
		System.out.println("Person Info");
		System.out.println("Age = "+p1.age);
		System.out.println("Name = "+p1.name);
		System.out.println("Gender = "+p1.gender);
		
		System.out.println("Person Info");
		System.out.println("Age = "+p2.age);
		System.out.println("Name = "+p2.name);
		System.out.println("Gender = "+p2.gender);
	}

}
