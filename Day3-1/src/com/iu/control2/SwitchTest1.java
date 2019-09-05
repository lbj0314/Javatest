package com.iu.control2;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		switch (num) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		default:
			System.out.println("그외 나머지");
			break;
		}
		//if ~ else 일때,
		if (num == 10) {
			
		} else if(num == 20){

		} else {
			
		}
		
		

	}

}
