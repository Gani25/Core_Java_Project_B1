package day12.multilevel;

public class InheritMain {
	
	public static void main(String[] args) {
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee(45,1000, "Ritik Pawar", "Male",35,1500);
		partTimeEmployee.calculateSalary();
		System.out.println(partTimeEmployee);
	}

}
