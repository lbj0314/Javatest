package com.iu.obj3;

public class Car {
	// 제조사
	// 모델명
	// 색상
	// 마력

	static String company = "Bugatti";
	String model;
	String color;
	int hp;
	Wheel wheel;


	//디폴트 생성자 선언
	//제조사 : bugatti
	//모델 : chiron
	//색상 : blue
	//마력 : 900
	//같은 메서드를 여러개 만드는 것 = 오버로딩
	//생성자 오버로딩
	public Car() {
		
		this.model = "Chiron";
		this.color = "Blue";
		this.hp = 900;
	}
	public Car(String color) {
		this.company = "Bugatti";
		this.model = "Chiron";
		this.color = color;
		this.hp = 900;

	}
	public Car(String color, int hp) {
		this.company = "Bugatti";
		this.model = "Chiron";
		this.color = color;
		this.hp = hp;
	}
	public Car(String model, String color, int hp) {
		this.company = "Bugatti";
		this.model = model;
		this.color = color;
		this.hp = hp;
		this.wheel = new Wheel();
	}

}
