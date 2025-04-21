package day14.abstract_class;

public abstract class Animal {

	public Animal() {
		System.out.println("Animal obj created");
	}
	
	public abstract void eat();
	public abstract void bark();

	public void walk() {
		System.out.println("Animal is walking on four legs");
	}

}
