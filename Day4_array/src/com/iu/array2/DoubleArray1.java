package com.iu.array2;

public class DoubleArray1 {

	public static void main(String[] args) {
		
//		int[][]	nums = new int[2][3];
		int [] n1 = {1, 2, 3};
		int [] n2 = {4, 5, 6};
//		모으려고 데이터타입[] 변수명
		
		int [][] n3 = {n1, n2};
//		int [][] n3 = {
//				{1, 2, 3}, //n1
//				{4, 5, 6}  //n2
//				};
		
		System.out.println(n3[1][2]); //6
		System.out.println(n3[0]); //n3[0]의 좌표값
		
		

	}

}
