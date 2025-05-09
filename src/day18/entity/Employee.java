package day18.entity;

public class Employee implements Comparable<Employee> {
	
	private int empId;
	
	private String firstName;
	
	private String lastName;

	private double salary;
	
	private int age;

	public Employee(int empId, String firstName, String lastName, double salary, int age) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee {empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", age=" + age + "}";
	}

	@Override
	public int compareTo(Employee o) {
		// Based on Emp ID
//		return empId-o.empId;
		// Based on First Name
//		return o.firstName.compareTo(firstName);
		// Based on Salary
		
		return Double.compare(salary, o.salary);
		
	}
	
	
}
