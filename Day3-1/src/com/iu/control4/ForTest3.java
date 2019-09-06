package com.iu.control4;

//import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		//* 찍기
		/*
		 * 	*****
		 *  *****
		 *  *****
		 *  *****
		 *  *****
		 *  
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//* 찍기
				/*
				 * 	*
				 *  **
				 *  ***
				 *  ****
				 *  *****
				 *  
				 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("*의 갯수를 입력하세요.");
//		int count = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//* 찍기
		/*
		 * 	*****
		 *  ****
		 *  ***
		 *  **
		 *  *
		 *  
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}//main

}//class
