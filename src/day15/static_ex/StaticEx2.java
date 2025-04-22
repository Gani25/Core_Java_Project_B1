package day15.static_ex;

public class StaticEx2 {

	public static void main(String[] args) {
//		Student2 student = new Student2();
//		// The final field Student2.COLLEGE_NAME cannot be assigned
////		student.COLLEGE_NAME = "ITM University";
//
//		student.name = "Abdul";
//		student.age = 30;
//
//		System.out.println("Student Info: ");
//		System.out.println("Name = " + student.name);
//		System.out.println("Age = " + student.age);
//		System.out.println("College Name = " + student.COLLEGE_NAME );
//
//		Student2 student2 = new Student2();
//
////		student2.COLLEGE_NAME = "Pillai";
//
//		student2.name = "Rishi";
//		student2.age = 25;
//
//		System.out.println("Student Info: ");
//		System.out.println("Name = " + student2.name);
//		System.out.println("Age = " + student2.age);
//		System.out.println("College Name = " + student2.COLLEGE_NAME );

		
		System.out.println("College Name through Class= " + Student2.COLLEGE_NAME );

		Student2.sayHello();
		
	}

}
