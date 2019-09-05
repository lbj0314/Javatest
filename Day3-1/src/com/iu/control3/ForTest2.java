package com.iu.control3;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		//for 10번 돌려봐라
		
		
		Scanner sc = new Scanner(System.in);
		//단수 입력
		System.out.println("단수를 입력하세요.");
		int dan = sc.nextInt();
//		System.out.println("횟수를 입력하세요.");
//		int count = sc.nextInt();
//		int i = 1;
		int result = 0;
		//0부터 9까지의 합을 계산
		for (int i = 1; i < 10; i++) {
			result = dan*i; 
			System.out.println(dan+" * "+i+" = "+result);
		}
		// 0부터 9까지 다 더한 수
		int total = 0;
		for (int j = 0; j < 10; j++) {
			total = j*(j+1)/2;
		}
		System.out.println(total);
		
		// 1부터 100사이의 숫자 중에서 홀수만 출력
		for (int k = 1; k <=100 ; k++) {
			if(k%2==1) {
				System.out.println(k);
			}
		}
		
	}

}
