package com.iu.control4;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		//0분 0초 ~ 59분 59초
		//분, 초를 입력 받음
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력하세요.");
		int min = sc.nextInt();
		System.out.println("초를 입력하세요.");
		int sec = sc.nextInt();
//		for (int i = 0; i < 60; i++) {
//			for (int j = 0; j < 60; j++) {
//				System.out.println(i+" 분 "+j+" 초");
//				if (i==min && j==sec) {
//					i=60; j=60;
//				}
//				
//			}
//		}
		//break를 사용해서 나가봐라
		int i = 0;
		int j = 0;
		boolean sucess = false;
		for (i = 0; i < 60; i++) {
			for (j = 0; j < 60; j++) {
				System.out.println(i+" 분 "+j+" 초");
				if (i==min && j==sec) {
					sucess = true;
					break;
					}
		
			}// for j
			if (sucess == true) {
				break;
			}
			
		}// for i
		
	}//main

}//class
