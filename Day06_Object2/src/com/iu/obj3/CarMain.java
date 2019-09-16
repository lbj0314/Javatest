package com.iu.obj3;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CarInfo carInfo = new CarInfo();
		Car car = new Car();
		Car car2 = new Car("Yellow");
		Car car3 = new Car("Gray", 1000);
		Car car4 = new Car("Bayron" ,"Gray", 1200);
		
		carInfo.carView(car);
		carInfo.carView(car2);
		carInfo.carView(car3);
		carInfo.carView(car4);
	}

}
