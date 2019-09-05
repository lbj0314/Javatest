package com.iu.control;

import java.util.Scanner;

public class Iftest5 {

	public static void main(String[] args) {
		// 국어, 영어, 수학
		// 과목당 40점 이상이어야 pass
		// 평균이 60점 이상이면 pass 아니면 fail
		int lang = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		lang = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = sc.nextInt();
		
		total = lang+eng+math;
		int avg = total/3;
		System.out.println(avg);
		
		if(avg<60 || lang<40 || eng<40 || math<40) {
			System.out.println("Fail 입니다.");
		}else{
			System.out.println("Pass 입니다.");
		}
		
		
	}

}
