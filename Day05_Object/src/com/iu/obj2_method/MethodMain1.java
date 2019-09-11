package com.iu.obj2_method;

public class MethodMain1 {

	public static void main(String[] args) {
//		클래스의 멤버(변수,메서드) 사용하려면 객체 생성
		
		MethodTest1 met1 = new MethodTest1();
		//멤버 메서드 info1 호출(사용)
		int num = 1000;
		
		met1.info1();
		System.out.println();
		//info2 호출
		met1.info2();
		
	}

}
