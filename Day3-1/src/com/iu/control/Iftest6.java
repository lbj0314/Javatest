package com.iu.control;

import java.util.Scanner;

public class Iftest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// sout, sysout
		System.out.println("숫자를 입력하세요.");
		
		int select = sc.nextInt();
		
		if (select == 1) {
			System.out.println("1을 입력하였습니다.");
		} else if(select == 2){
			System.out.println("2를 입력하였습니다.");

		} else if (select == 3) {
			System.out.println("3을 입력하였습니다.");
		} else {
			System.out.println("1,2,3 외 숫자를 입력하였습니다.");
		}
		
		

	}

}
