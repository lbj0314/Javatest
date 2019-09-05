package com.iu.control3;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		//for(초기식;조건식;증감식){}
		
		//System.out.println("hi!");
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수를 입력하세요.");
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("hi");
		}
		
		System.out.println("종료");
		
		
	}

}
