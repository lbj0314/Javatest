package com.iu.obj1;

import com.iu.obj1.ObjectTest1;

public class ObjectMain {

	public static void main(String[] args) {
		//(객체(Object, Instance) 생성
		//클래스명 변수명; -> 일종의 변수 선언과 동일
		//클래스명 변수명 = new 클래스명();
		ObjectTest1 obj1 = new ObjectTest1();
		
		obj1.number = "1002-839-123456";
		obj1.money = 1000000000;
		obj1.name = "LBJ";
		
		System.out.println("예금주 : "+obj1.name);
		System.out.println("계좌번호 : "+obj1.number);
		System.out.println("잔액 : "+obj1.money);
		
		//통장 1개를 더 만들고 데이터 입력 후 출력
		ObjectTest1 obj2 = new ObjectTest1();
		
		obj2.number = "1002-439-654321";
		obj2.money = 300000000;
		obj2.name = "이병주";
		
		System.out.println("예금주 : "+obj2.name);
		System.out.println("계좌번호 : "+obj2.number);
		System.out.println("잔액 : "+obj2.money);
		
		System.out.println(obj1 == obj2); // 주소값 비교라서 같은 변수값을 입력했어도 false
		
		System.out.println(obj1.name == obj2.name);
		
		//class는 또 다른 의미로 개발자가 만드는 복합 Data Type
		
		obj1 = obj2; //obj2가 출력
		
		obj2.money = 1000000;
		
		System.out.println("예금주 : "+obj1.name);
		System.out.println("계좌번호 : "+obj1.number);
		System.out.println("잔액 : "+obj1.money);
		
		
		
		
	} //main

} // class
