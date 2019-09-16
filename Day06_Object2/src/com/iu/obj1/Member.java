package com.iu.obj1;

public class Member {
	
	int age; //회원의 나이
	String name; // 회원의 이름
	
	//생성자(Constructor) 선언
	//기본 생성자
	//디폴트 생성자
	//빈 생성자
	public Member() {
		System.out.println("Member 객체 생성");
		this.age = 24;
		this.name = "momo";
		this.info(24);
	}
	
	
	public void info(int age) {
		//회원의 정보를 출력하려고 하는 메서드
		//지역 변수와 멤버 변수의 구분을 지어주기 위해 this를 씀
		System.out.println(this.age); //this가 생략됨
		System.out.println(name); //heap에 생성된 주소가 필요
		System.out.println(this);
		
		info2();
		//this : 만들어진 자기 자신의 객체 주소
		//내부에서 자동 생성되는 참조변수
	}
	
	public void info2() {
		System.out.println("info2 Method");
		
		
		
		
	}
	
	
}
