package day14.interface_ex.impl;

import day14.interface_ex.Dog;

public class DogImpl implements Dog {

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Dog is walking");
		
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking");
		
	}

}
