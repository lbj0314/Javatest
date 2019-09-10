package com.iu.ex1_school;

public class Student {
//	성적 관리 프로그램
//	국어, 영어, 수학, 이름, 번호, 총점, 평균
	int lang;
	int eng;
	int math;
	String name;
	int number;
	int total;
	double avg;
	
//	접근 지정자 [그외 지정자] 리턴타입 메서드명([매개 변수들 선언) { 실행해야할 코드 }
//	접근 지정자 -> public,  protected, default, private
//	그외 지정자 -> 생략
//	리턴 타입 -> void
//	매개 변수 -> 생략
//	info
	public void info() {
		System.out.println("info Start");
		System.out.println("info Finish");
	}
	
}
