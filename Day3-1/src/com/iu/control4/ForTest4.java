package com.iu.control4;

public class ForTest4 {

	public static void main(String[] args) {
		//break
		int num = 3;
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i+" : "+j);
				if (j == num) {
					break;
				}
			}//for j
			
		}//for i
		System.out.println("프로그램 종료");
	}//main

}//class
