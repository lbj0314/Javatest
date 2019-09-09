package com.iu.array1;

public class ArrayTest2 {

	public static void main(String[] args) {
		// double type 3개를 모을 배열을 선언하고
		// 각각 3개의 데이터를 입력
		double[] num = new double[3];
		
		num[0] = 1.3;
		num[1] = 2.4;
		num[2] = 3.1;
		
		double[] n2 = num;
		
		n2[1] = 12.222;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		System.out.println("n2[0] : "+n2[0]);
		System.out.println("n2[1] : "+n2[1]);
	
		double n = num[1];
		num[2] = n;
		num[0] = 3.12;
		num[2] = 'c';

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);

	}

}
