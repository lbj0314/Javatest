package com.iu.lang.ex3;

public class CarMaker {

	private String carInfo;

	public CarMaker() {
		carInfo = "Bugatti, chiron, Blue, Audi, R8, Black, Benz, S600, White, BMW, M2 Competition, DarkBlack";
		//csv
		
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
	//MakeCars 메서드
	//Car들을 리턴
	public Car[] makeCars() {
		CarMaker cm = new CarMaker();

		String [] c = carInfo.split(", ");
//		System.out.println(c[6]);
		Car [] cars = new Car[c.length/3]; 
//		cars = null;
//		int idx = 0 ;
		for (int i = 0; i < c.length; i++) {
			Car car= new Car();
			car.setCompany(c[i]);
			car.setModel(c[++i]);
			car.setColor(c[++i]);
//			cars[idx] = car;
//			idx++;
			cars[i/3] = car;
			
			
		}
		return cars;

	}


	//MakeCar 메서드 명
	//carInfo의 bugatti를 Car 클래스에 집어 넣기 반복해서 리턴
	public Car makeCar() {
		CarMaker cm = new CarMaker();
		//		System.out.println(cm.getCarInfo());
		Car car = new Car();
		String [] c = carInfo.split(", ");
		car.setCompany(c[0]);
		car.setModel(c[1]);
		car.setColor(c[2]);




		return car;
	}

}
