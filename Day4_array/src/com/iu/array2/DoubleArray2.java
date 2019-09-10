package com.iu.array2;

import java.util.Scanner;

public class DoubleArray2 {

	public static void main(String[] args) {
//		지역 변수는 초기화 해주어야 함
//		heap 영역은 안해줘도 됨
		int[][] nums = new int[2][3];
//		System.out.println(nums[0][0]);
		
//		System.out.println(nums.length);
//		System.out.println(nums[0].length);
//		System.out.println(nums[1].length);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print("입력");
				nums[i][j] = sc.nextInt();
				
			}//for2
			
		}//for1
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]);
				
			}//for2
			
		}//for1
		

	}//main

}//class
