package com.iu.array1;

import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[] n1 = {1, 2, 3}; //3
		int[] n2 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //9
		
		n1 = n2;
		
//		System.out.println(n1.length);
		
//		1~9번 숫자 하나를 입력 받아서,
//		해당 인덱스 번호를 출력하라.
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 9까지의 숫자 중 하나를 입력하세요.");
		int num = sc.nextInt();
		int i = 0;
		boolean check = false;
		for (i = 0; i < n2.length; i++) {
			if(num == n2[i]) {
				check = true;
				break;
			}//if
			
		}// for
		if(check == true) {
			System.out.println(i);
		}else {
			System.out.println("번호를 찾을 수 없습니다.");
		}
		
		
		
	}// main

}// class
