package day12;

public class Employee extends Person {

	private int empId;

	private double salary;

	public Employee() {
		System.out.println("Default constructor of Employee");
	}

	public Employee(int empId, double salary, String name, int age, String gender) {
		super(age,name,gender); // base class parameterized cosntructor will be invoked.
		System.out.println("Parameterized constructor of Employee");
		this.empId = empId;
		this.salary = salary;
		
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [empId=" + empId + ", salary=" + salary + "]";
	}
	
	
	
	

}
