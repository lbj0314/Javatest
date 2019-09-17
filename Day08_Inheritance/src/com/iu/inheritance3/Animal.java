package com.iu.inheritance3;

public abstract class Animal {
	
	int age;
	String name;
	
	public Animal() {
		
	}
	
	public Animal(int age) {
		this.age = age;
	}
	
	public abstract void sleep();
	
	
}
