package com.iu.inheritance3;

public class Lion extends Animal {
	String color;
	
	public Lion() {
		super(10); // 부모의 생성자를 호출
//		this();  
		
		super.age = 20;
		this.age = 24;
		
		
	}
	
	public void sleep() {
		System.out.println("엎드려 자기");
	}
	
	
}
