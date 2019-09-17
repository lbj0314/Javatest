package com.iu.inheritance3;

public class AnimalMain {

	public static void main(String[] args) {
		Lion lion = new Lion();
		
//		Animal animal = new Animal(); //
		lion.sleep();
		
		int age = 24;
		
		Eagle eagle = new Eagle() {

		};
		
		Animal animal = lion;
		animal = eagle;
		
	}

}
