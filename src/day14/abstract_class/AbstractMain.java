package day14.abstract_class;

public class AbstractMain {
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		
//		dog.bark();
//		dog.walk();
//		dog.eat();
		
		Animal animal = new Dog();
		
		animal.eat();
		animal.walk();
		animal.bark();
	}

}
