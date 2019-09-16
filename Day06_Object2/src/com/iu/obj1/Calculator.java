package com.iu.obj1;

public class Calculator {
	//메서드 오버 로딩
	//비슷한 일을 하는 같은 이름의 메서드를 여러개 만드는 것
	//조건
	//메서드 이름이 같아야 함
	//매개 변수의 개수 또는 타입이 달라야 함
	//접근 지정자나 리턴 타입은 상관 없음
	public void hap(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public void hap(int num1, float num2) {
		System.out.println(num1 + num2);
	}
	public void hap(float num1, float num2) {
		System.out.println(num1 + num2);
	}
	public void hap(float num1, double num2) {
		System.out.println(num1 + num2);
	}
	public double hap(double num1, double num2) {
		System.out.println(num1 + num2);
		return num1 + num2;
	}
}

