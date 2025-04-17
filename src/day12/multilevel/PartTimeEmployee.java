package day12.multilevel;

public class PartTimeEmployee extends Employee {

	private int numOfDays;
	private int dailyWages;

	public PartTimeEmployee() {
		System.out.println("Default of PartTimeEmployee");
	}

	public PartTimeEmployee(int numOfDays, int dailyWages, String name, String gender, int age, int empId) {
		super(empId, (dailyWages * numOfDays), name, age, gender);
		System.out.println("Parameterized of PartTimeEmployee");
		this.numOfDays = numOfDays;
		this.dailyWages = dailyWages;
	}

	@Override
	public void calculateSalary() {

		System.out.println("No Tax Deducted");

	}

	@Override
	public String toString() {
		return super.toString() + "PartTimeEmployee [numOfDays=" + numOfDays + ", dailyWages=" + dailyWages + "]";
	}

}
