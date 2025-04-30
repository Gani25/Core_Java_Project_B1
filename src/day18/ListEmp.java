package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day18.entity.Employee;

public class ListEmp {
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
	
		System.out.println(employees.isEmpty());
		
		Employee employee1 = new Employee(1010,"Rohit","Mehta",35000,30);
		employees.add(employee1);
		
		employees.add(new Employee(1006, "Hrithik", "Gupta", 45000, 35));
		employees.add(new Employee(1001, "Hrithik", "Sharma", 25000, 20));
		employees.add(new Employee(1005, "Rishikesh", "Patil", 35000, 25));
		employees.add(new Employee(1002, "Rohan", "Gupta", 45000, 40));
		employees.add(new Employee(1008, "Pranjal", "Sharma", 22000, 23));
		employees.add(new Employee(1003, "Rohit", "Upadhyay", 45000, 27));
		employees.add(new Employee(1007, "Om", "Nibalkar", 45000, 20));
		employees.add(new Employee(1004, "Abdul", "Memon", 22000, 25));
		employees.add(new Employee(1009, "Rohit", "Patil", 25000, 33));
		
		System.out.println("----------------------------");
		System.out.println("All Employees Are");
		System.out.println("----------------------------");
	
		for(Employee emp:employees) {
			System.out.println(emp);
			
			System.out.println();
		}
		employees.sort(null);
		
		System.out.println("Sorting All Employees By Asc Order");
		for(Employee emp:employees) {
			System.out.println(emp);
			
			System.out.println();
		}
		
	}

}
