package day12;

public class Person {

	protected int age;

	protected String name;

	protected String gender;

	public Person() {
		super();
		System.out.println("Default constructor of Person");
	}

	public Person(int age, String name, String gender) {
		
		System.out.println("Parametrized constructor of Person");
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	
}
