package day26;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		List<Employee> employees = Arrays.asList(
				new Employee("Abdul Gani", 50000.0, dateFormat.parse("01-01-2020"), "MALE"),
				new Employee("Pranjal Sharma", 40000.0, dateFormat.parse("15-05-2018"), "F"),
				new Employee("Kailas Rajput", 20000.0, dateFormat.parse("10-12-2024"), "M"),
				new Employee("Mahesh Shinde", 70000.0, dateFormat.parse("20-03-2025"), "M")
				);
		
		System.out.println("All Employees");
		employees.forEach(System.out::println);
		
		// Q1. Find maximum Salary of employee
		
		Optional<Employee> optionalMaxEmp = employees
		.stream()
		.max((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary()));
		
		System.out.println("Maximim Sal Empl = \n"+optionalMaxEmp.get());
		
		// Q2. second highest salaried employee
		
		Employee secondMaxEmp = employees
				.stream()
				.sorted((e1,e2)-> Double.compare(e2.getSalary(), e1.getSalary()))
				.skip(1)
				.findFirst()
				.get();
		System.out.println("Second Highest Sal Empl = \n"+secondMaxEmp);
		
		// Q3. Find Most senior employee in organization
		
		Optional<Employee> oldestEmp = employees
				.stream()
				.min((e1,e2)-> e1.getJoiningDate().compareTo(e2.getJoiningDate()));
		
		System.out.println("Most Senior Employee:");
		oldestEmp.ifPresent(System.out::println);
		
		// Q4. Count employees based on gender
		
		Map<String, Long> genderCount = employees
		.stream()
		.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		
		System.out.println(genderCount);
	}
}
