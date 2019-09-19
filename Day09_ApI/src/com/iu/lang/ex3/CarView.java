package com.iu.lang.ex3;

public class CarView {
	//view
	
	public void view(Car car) {
		
		System.out.println("제조사 : "+car.getCompany());
		System.out.println("자동차명 : "+car.getModel());
		System.out.println("색상 : "+car.getColor());
	}

	public void view(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
//			System.out.println("제조사 : "+cars[i].getCompany());
//			System.out.println("자동차명 : "+cars[i].getModel());
//			System.out.println("색상 : "+cars[i].getColor());
		System.out.println("-------------------------");
		this.view(cars[i]);
		}
		
		
	}
}
