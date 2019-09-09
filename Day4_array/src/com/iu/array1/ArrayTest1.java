package com.iu.array1;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 배열 선언
		// 데이터 타입[] 변수명 = new 데이터타입[갯수];
		// ex) 정수형 데이터를 3개 모아보기
		int[] numbers = new int[3];
		System.out.println(numbers);
		numbers[0] = 20;
		numbers[1] = 30;
		numbers[2] = 40;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		int n = numbers[1];
		numbers[2] = n;
		numbers[0] = (int)3.12;
		numbers[2] = 'c';
		System.out.println(numbers[5]);

	}

}
