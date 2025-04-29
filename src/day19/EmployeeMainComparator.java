package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import day19.entity.Employee;

public class EmployeeMainComparator {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		System.out.println(employees.isEmpty());

		employees.add(new Employee(1010, "Rohit", "Mehta", "Sales", 35000, 30));
		employees.add(new Employee(1006, "Hrithik", "Gupta", "IT", 45000, 35));
		employees.add(new Employee(1001, "Hrithik", "Sharma", "HR", 25000, 20));
		employees.add(new Employee(1005, "Rishikesh", "Patil", "IT", 22000, 45));
		employees.add(new Employee(1002, "Rohan", "Gupta", "Admin", 45000, 40));
		employees.add(new Employee(1008, "Pranjal", "Sharma", "HR", 22000, 23));
		employees.add(new Employee(1003, "Rohit", "Upadhyay", "Sales", 45000, 27));
		employees.add(new Employee(1007, "Om", "Nibalkar", "Sales", 45000, 20));
		employees.add(new Employee(1004, "Abdul", "Memon", "IT", 22000, 25));
		employees.add(new Employee(1009, "Rohit", "Patil", "HR", 45000, 33));

		System.out.println("----------------------------");
		System.out.println("All Employees Are");
		System.out.println("----------------------------");

		for (Employee emp : employees) {
			System.out.println(emp);

			System.out.println();
		}

		Comparator<Employee> comparator = (e1, e2) -> {

			// First Compare By Department
			int deptCompare = e1.getDepartment().compareTo(e2.getDepartment());

			if (deptCompare == 0) {

				// Compare by salary
				int salCompare = Double.compare(e1.getSalary(), e2.getSalary());

				if (salCompare == 0) {
					// Compare by Age if salary is same
					return Integer.compare(e1.getAge(), e2.getAge());
				} else {

					return salCompare;
				}
			} else {

				return deptCompare;
			}
		};

		employees.sort(comparator);

		System.out.println("----------------------------");
		System.out.println(
				"Sort Employee By Dept and If Dept Repeated then sort by Salary and If Sal repeated the sort by age");
		System.out.println("----------------------------");
		for (Employee emp : employees) {
			System.out.println(emp);

			System.out.println();
		}

	}
}
