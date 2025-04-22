package day15.static_ex;

public class Student2 {

	public int age;

	public String name;

	public static final String COLLEGE_NAME = "SPRK_TECHNOLOGIES";

	
	public static void sayHello() {
		
		System.out.println("Hello World\n");
		// Cannot make a static reference to the 
		// non-static method greet() from the type Student2
		// greet();
		
		sayBye();
	}
	
	public static void sayBye() {
		System.out.println("Byee");
	}
	
	public void greet() {
		System.out.println("Welcome");
	}

}
