package day14.interface_ex;

import day14.interface_ex.impl.DogImpl;

public class InterfaceMain {

	public static void main(String[] args) {
		Dog dog = new DogImpl();
		
		dog.bark();
		dog.eat();
		dog.walk();
	}
}
