package com.iu.operator2;

import java.util.Scanner;

public class Operator5 {

	public static void main(String[] args) {
		//키보드로 부터 나이를 입력 받음
		//미성년자, 성년자 인가를 판별
		Scanner sc = new Scanner(System.in);
		int age = 0;
		String result = "";
		
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		//조건식 ?A:B
		
		result = age>=20?"성년자":"미성년자";
		System.out.println(result);
		System.out.println("==============================");
		/*
		 * 10대인가?
		 * 
		 */
		
		result = age<= 19 && age >=10?"10대":"10대 아님";
		System.out.println(result);
		
		/*int age = 20;
		String result1 = null;
		String result2 = null;
		
		result1 = age >= 20?"성년자":"미성년자";
		result2 = age <= 19?"성년자":"미성년자";
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);*/
	}

}
