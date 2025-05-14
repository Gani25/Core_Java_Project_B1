package day27.copy;

public class Person {
	
	String name;
	
	int age;
	
	String gender;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(Person person) {
		name = person.name;
		gender = person.gender;
		age = person.age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
