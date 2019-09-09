package com.iu.array1;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//점수를 3개 입력 받아서
		//저장할 배열을 생성
		//총점과 평균을 계산해서 출력
		
		System.out.println("과목수를 입력하세요.");
		int lec = sc.nextInt();
		
		int[] score = new int[lec];
		int total = 0;
		double avg = 0;
		String[] names = new String[score.length];
		//과목수 만큼 과목명을 입력
//		for (int i = 0; i < score.length; i++) {
//			System.out.println((i+1)+"번째 과목명을 입력하세요.");
//		String[] names = new String[score.length];
//		names[i]=sc.next();
//		}

		//과목 한번 점수 한번씩 입력하고 싶을때,
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 과목명을 입력하세요.");		
			names[i]=sc.next();
			
			System.out.println((i+1)+"번째 점수를 입력하세요");
			score[i]= sc.nextInt();
			
			total += score[i];
		}
		avg = (double)total/score.length;
		System.out.println("과목수는 "+lec+"개이고,");
		for (int i = 0; i < score.length; i++) {
		System.out.println(names[i]);
	}
		System.out.println("총점은 "+total+"점이며,");
		System.out.println("평균은 "+avg+"점입니다.");
	}

}
