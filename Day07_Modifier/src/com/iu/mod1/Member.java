package com.iu.mod1;

public class Member {

	private int age;
	private String name; //defalut
	private double tall;


	//디폴트 생성자 자동 생성
	public Member(){}

	public Member(String name, int age, double tall) {
		this.name = name;
		this.age = age;
		this.tall = tall;
	}
	
	public void setAge(int age) {
		if(age <= 0 && age <150) {
			this.age = age;	
		}else {
			this.age = 17;
		}
	}

	public int getAge() {
		if(age <= 0 && age < 150) {

		}
		return this.age;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//getTall
	public double getTall() {
		return this.tall;
	}

	public void info() {
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.tall);
		this.test();

	}
	
	private void test() {
		
	}
	
	
	
}
