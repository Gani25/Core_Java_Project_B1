package day11.inheritance;

import day11.inheritance.parent.Animal;

public class Dog extends Animal {

	public Dog() {
		System.out.println("Dog is created");
	}

	public void bark() {
		System.out.println("Dog is Barking");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}

}
