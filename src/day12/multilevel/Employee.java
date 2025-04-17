package day12.multilevel;

public class Employee extends Person {

	protected int empId;

	protected double salary;

	public Employee() {
		System.out.println("Default constructor of Employee");
	}

	public Employee(int empId, double salary, String name, int age, String gender) {
		super(age, name, gender); // base class parameterized cosntructor will be invoked.
		System.out.println("Parameterized constructor of Employee");
		this.empId = empId;
		this.salary = salary;

	}

	public void calculateSalary() {
		// salary >15000 10% Tax Deducted
		if (salary > 15000) {
			System.out.println("10 % Tax Deducted");
			salary = salary - 0.1 * salary;
		} else {
			System.out.println("No Tax Deducted");
		}

	}

	@Override
	public String toString() {
		return super.toString() + "Employee [empId=" + empId + ", salary=" + salary + "]";
	}

}
