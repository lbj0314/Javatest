package com.iu.control;

public class Iftest1 {

	public static void main(String[] args) {
		/**********************
		 * 단일  if
		 * 
		 * 형식
		 * if(조건식) {}
		 * 
		 * 
		 ***********************/
		int age = 19;
		String result = "미성년";
		String result2 = "10대가 아닙니다.";
		
		if(age>=20) {
			result = "성년";
		}
		if(19>= age && age >=10) {
			result2 = "10대가 맞습니다.";
		}
		System.out.println(result);
		System.out.println(result2);
		
	}

}
