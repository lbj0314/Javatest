package com.iu.control3;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		// 0에서 60 미만의 초를 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("0에서 60 미만의 초를 입력하세요.");
		int count = sc.nextInt();
		int sec = 0;

		for(sec = 0; sec<60; sec++) {
			System.out.println(sec+"초");
			if(count==sec) {
				sec=60;
			}
			
		}
//		System.out.println(sec);
	}//main

}//class
