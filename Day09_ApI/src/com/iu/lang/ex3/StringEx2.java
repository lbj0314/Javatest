package com.iu.lang.ex3;

public class StringEx2 {

	public static void main(String[] args) {
		CarMaker cm = new CarMaker();
		Car car = cm.makeCar();
		Car[] cars = cm.makeCars();
		CarView cv = new CarView();
		
//		cv.view(car);
		cv.view(cars);
		
	}

}
