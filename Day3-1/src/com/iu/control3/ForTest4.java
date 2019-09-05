package com.iu.control3;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		// 1부터 100사이의 수를 입력
		// 0부터 입력한 수 까지의 합을 계산하여 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 100사이의 수를 입력하세요.");
		int count = sc.nextInt();
		
		int total = 0;
		for(int i=0; i<=count; i++) {
				total += i;
		}
		System.out.println(total);
	}//main

}//class
