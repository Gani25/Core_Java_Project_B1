package day21.checkedExceptions;

public class PersonMain1 {
	
	public static void main(String[] args) {
		Person person = new Person();
//		Unhandled exception type SalaryInvalidException
		
		try {
			
			person.acceptAge();
			System.out.println(person);
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello After Printing Person");
	}

}
