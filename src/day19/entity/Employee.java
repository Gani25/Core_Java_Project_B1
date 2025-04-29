package day19.entity;

public class Employee {
	
	private int empId;
	
	private String firstName;
	
	private String lastName;
	
	private String department;

	private double salary;
	
	private int age;

	public Employee(int empId, String firstName, String lastName, String department,double salary, int age) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", salary=" + salary + ", age=" + age + "]";
	}

		
	
}
