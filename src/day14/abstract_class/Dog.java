package day14.abstract_class;

public class Dog extends Animal {

	public Dog() {
		System.out.println("Dog Created");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating biscuits");
	}

	public void bark() {
		System.out.println("Dog is barking");
	}

}
