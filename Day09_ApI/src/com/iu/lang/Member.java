package com.iu.lang;

public class Member {
	
	int age;
	int num;
	static int tall;
	{
		System.out.println("인스턴스 초기화 블럭");
	}
	
	static {
		System.out.println("실행시 한번만 초기화");
		Member.tall = 165;
		System.out.println(tall);
	}
	
	public Member() {
		System.out.println("생성자 호출");
	}
	
	@Override
	public String toString() {
		System.out.println("Age : "+ this.age);
		System.out.println("Num : "+ this.num);
		return "";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean check = true;
		
//		Member m2 = (Member)obj;
		
//		check = this.age == m2.age && this.num == m2.num;
		check = this.age == ((Member)obj).age 
				&& this.num == ((Member)obj).num;
		
		
		return check;
	}
	//m1.equals(m2);
	
	
	
	
}
