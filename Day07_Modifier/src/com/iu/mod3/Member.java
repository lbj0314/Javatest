package com.iu.mod3;

public final class Member {
	
	public static int age; //클래스 변수
	public String name; //멤버 변수
	
	//멤버 메서드
	public void instanceMethod() {
		System.out.println(name);
		System.out.println(age);
		info();
	}
	
	//클래스 메서드
	//객체를 만들어서 사용하는 인스턴스 변수(멤버 변수)와 
//	인스턴스 메서드(멤버 메서드)는 사용 불가능
	public static void info() {
		System.out.println(age);
//		System.out.println(name);
//		instanceMethod();
//		this.age = 20;
	}
	
	
}
