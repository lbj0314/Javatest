package com.iu.obj2_method;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {

		MethodTest2 met2 = new MethodTest2();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수의 갯수를 입력하세요.");
//		int count = sc.nextInt();
		
		int[] arr = {1, 2, 3, 4};
		
		met2.info1(arr);
//		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
