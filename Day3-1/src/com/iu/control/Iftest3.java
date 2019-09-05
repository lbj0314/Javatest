package com.iu.control;

import java.util.Scanner;

public class Iftest3 {

	public static void main(String[] args) {
		/*
		 * 키보드로 부터 월급여와 나이를 입력 받음
		 * 급여
		 * 200이상 ~ 300 미만 소득세 2.2%
		 * 300이상 ~ 400 미만 소득세 3.0%
		 * 400이상 ~		     소득세 3.5%
		 * 
		 * 20세 이상 ~ 30세 미만 1.2%
		 * 30세 이상 ~ 40세 미만 2%
		 * 40세 이상 ~		    4%
		 */
		Scanner sc = new Scanner(System.in);
		double money;
		int age;
		double tax1=0;
		double tax2=0;
		double result=0;
		
		System.out.println("월급여를 입력하세요");
		money = sc.nextInt();
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		if(money>=200 && money<300) {
			tax1=2.2/100;
			money = (double)(money-money*(2.2/100));
		}
		if(money>=300 && money<400) {
			tax1=3.0/100;
			money = (double)(money-money*(3.0/100));
		}
		if(money>=400) {
			tax1=3.5/100;
			money = (double)(money-money*(3.5/100));
		}
		
				
		System.out.println("소득세 공제 :"+money+"만원");
		if(age>=20 && age<=29) {
			tax2=1.2/100;
			result = (double)(money-money*(1.2/100));
		}
		if(age>=30 && age<=39) {
			tax2=2/100;
			result = (double)(money-money*(2.0/100));
		}
		if(age>=40) {
			tax2=4/100;
			result = (double)(money-money*(4.0/100));
		}
		//소득세
		money = (double)(money-money*tax1);
		//나이 세금
		money = (double)(money-money*tax2);
		System.out.println("최종 월급 :"+result+("만원"));
	}	
}

