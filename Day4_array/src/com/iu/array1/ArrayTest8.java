package com.iu.array1;

import java.util.Scanner;

public class ArrayTest8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = {1, 2, 3, 4, 5}; //5
		
		System.out.println("1번부터 5번 사이의 숫자 입력");
		int num = sc.nextInt();
		int index = 0;
		for(index = 0; index < numbers.length; index++) {
			if(num == numbers[index]) {
				break;
			}
		}
		
		int [] numbers2 = new int[4];
		int idx = 0; //numbers2의 인덱스
		for (int i = 0; i <= numbers2.length; i++) {
			if(index == i) {
				continue;
			}
			numbers2[idx] = numbers[i];
			idx++;
		}
		numbers = numbers2;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
	}// main

}// class
