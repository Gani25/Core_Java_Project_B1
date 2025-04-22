package day15.static_ex;

public class StaticEx1 {

	public static void main(String[] args) {
		Student student = new Student();

		student.colgName = "ITM University";

		student.name = "Abdul";
		student.age = 30;

		System.out.println("Student Info: ");
		System.out.println("Name = " + student.name);
		System.out.println("Age = " + student.age);
		System.out.println("College Name = " + student.colgName);

		Student student2 = new Student();

		student2.colgName = "Pillai";

		student2.name = "Rishi";
		student2.age = 25;

		System.out.println("Student Info: ");
		System.out.println("Name = " + student2.name);
		System.out.println("Age = " + student2.age);
		System.out.println("College Name = " + student2.colgName);

		System.out.println("Student Info: ");
		System.out.println("Name = " + student.name);
		System.out.println("Age = " + student.age);
		System.out.println("College Name = " + student.colgName);

	}

}
