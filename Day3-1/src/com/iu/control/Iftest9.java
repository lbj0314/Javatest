package com.iu.control;

import java.util.Scanner;

public class Iftest9 {

	public static void main(String[] args) {
		//점심 메뉴 고르기
		//일식, 중식, 양식, 한식
		//인원수 입력
		//최종 결제 금액 출력
		//4명당 1인분 무료
		//1 2 3 =0
		//4 5 6 7 =1
		//8 9 10 11 =2
		Scanner sc = new Scanner(System.in);
		System.out.println("1, 일식");
		System.out.println("2, 중식");
		System.out.println("3, 양식");
		System.out.println("4, 한식");
		System.out.println("5, 종료");
		int select = sc.nextInt();
		//String result ="";
		System.out.println("인원 수를 입력하세요.");
		int member = sc.nextInt();
		int price = 0;
		if (select == 1) {
			//System.out.println("1, 일식 선택하셨습니다. 인원수를 입력하세요.");
			price = 5000;
			
			//int member = sc.nextInt();
			//int total = member*5000;
			//result = "총 금액은 "+total+"원 입니다.";
		} else if(select == 2){
			//System.out.println("2, 중식 선택하셨습니다. 인원수를 입력하세요.");
			price = 8000;
			//int member = sc.nextInt();
			//int total = member*8000;
			//result = "총 금액은 "+total+"원 입니다.";
		} else if(select == 3){
			//System.out.println("3, 양식 선택하셨습니다. 인원수를 입력하세요.");
			price = 4000;
			//int member = sc.nextInt();
			//int total = member*4000;
			//result = "총 금액은 "+total+"원 입니다.";
		} else if(select == 4){
			//System.out.println("4, 한식 선택하셨습니다. 인원수를 입력하세요.");
			price = 3000;
			//int member = sc.nextInt();
			//int total = member*3000;
			//result = "총 금액은 "+total+"원 입니다.";
		} else if(select == 5){
			System.out.println("5, 종료를 선택하셨습니다. 안녕히 가십시오.");
		}
		/*
		 * if(member>=4 || member%4==0) { int total = 0; total =
		 * price*member-(price*member/4); System.out.println("4명당 1명은 무료입니다.");
		 * System.out.println("최종 결제 금액은 "+total+"원 입니다."); }else {
		 * System.out.println("최종 결제 금액은 "+price*member+"원입니다."); }
		 */
		int result = price*member - member/4*price;
		System.out.println("최종 결제 금액은 "+result+"원입니다.");
	}

}
