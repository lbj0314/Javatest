package com.iu.operator2;

public class Operator1 {
	
	public static void main(String [] args) {
		// 논리 연산자
		// and  연산자 : &&
		boolean check1 = true;
		boolean check2 = false;
		boolean result = check1 && check2;
		
		result = check1 || check2; //true
		result = !result; //false
		
		System.out.println(!result); //true
	}
}
