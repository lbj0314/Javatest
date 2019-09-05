package com.iu.control3;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		//학생의 인원수 입력
		//각 학생의 나이를 입력
		//평균 나이를 출력
		int age = 0;
		int total = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 인원수를 입력하세요.");
		int num = sc.nextInt();

		for(int i=0; i<num; i++) {
//			System.out.println(i);
//			for(int j=0; j<=i-1; j++) {
				System.out.println("나이를 입력하세요.");
				age = sc.nextInt();
				total += age;
//			}
			
//			System.out.println(total);
			avg = total/num;
		}
		System.out.println(avg);
	}//main

}//class
