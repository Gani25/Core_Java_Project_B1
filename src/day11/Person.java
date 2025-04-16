package day11;

public class Person {

	// FIELDS
	private String name;

	private int age;

	private String gender;

	public Person() {
		System.out.println("Default Constructor of Person Class");
	}

	public Person(String name, int age, String gender) {
		
		System.out.println("Parameterized Constructor of Person Class");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	

}
