package com.iu.array1;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문자열 4개를 담을 수 있는 배열을 선언,
		//반복문을 이용하여 4개의 데이터를 입력
		//4개의 데이터를 출력
		String[] names = new String[4];
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i+"번째 이름을 입력하세요.");
			names[i]= sc.next();
			
		}
		for (int j = 0; j < 4; j++) {
		System.out.println(names[j]);
			}
	}

}
