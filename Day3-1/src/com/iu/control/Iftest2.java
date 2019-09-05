package com.iu.control;

import java.util.Scanner;

public class Iftest2 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력 받아서, 평균을 계산
		// 평균이 90 이상이면 우등상 수상
		Scanner sc = new Scanner(System.in);
		int lang;
		int eng;
		int math;
		int total;
		int avg;
		String result = "";
		
		System.out.println("국어 점수를 입력하세요");
		lang = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = sc.nextInt();
		
		total = lang+eng+math;
		avg = total/3;
		if(avg>=90) {
			//평균이 95 이상인 학생은 장학금 수상 출력
			if(avg>=95) {
				System.out.println("장학금 수상");
			}
			result = "우등상 수상";
			
		}
		System.out.println("졸업");
		System.out.println(result);

	}

}
