package com.iu.array1;

import java.util.Scanner;

public class ArrayTest9 {

	private static int[] totals;
	private static double[] avgs;

	public static void main(String[] args) {
		
		// 과목 : 국어, 영어, 수학으로 고정
		// 학생의 인원수는 n명
		//1. 성적 입력
		// 학생의 수를 입력
		// 학생의 이름, 번호, 국어, 영어, 수학 점수
		//2. 전체 조회
		// 이름, 번호, 국어, 영어, 수학, 총점, 평균
		//3. 학생 검색
		// 학생의 번호를 입력
		// 이름, 번호, 국어, 영어, 수학, 총점, 평균
		// 배열 생각하기
		//4. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		
		int count = 0; //학생 수
		String[] names = null; //이름
		int[] numbers = null; //번호
		int[] lang = null; //국어
		int[] eng = null; //영어
		int[] math = null; //수학
		int[] total = null; //총점수
		double[] avg = null; //평균
		boolean check = true;
		
		while(check) {
			System.out.println("1. 성적 입력");
			System.out.println("2. 전체 조회");
			System.out.println("3. 학생 검색");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();
			int i = 0;
			if(select==1) {
				System.out.println("학생의 수를 입력하세요.");
				count = sc.nextInt();
				names = new String[count];
				numbers = new int[count];
				lang = new int[count];
				eng = new int[count];
				math = new int[count];
				total = new int[count];
				avg = new double[count];
				
				for(i = 0; i <count; i++) {	
				System.out.println("학생의 이름을 입력하세요.");
				names[i] = sc.next(); // 이름
				System.out.println("학생의 번호를 입력하세요.");
				numbers[i] = sc.nextInt(); //번호
				System.out.println("국어 점수를 입력하세요.");
				lang[i] = sc.nextInt(); //국어
				System.out.println("영어 점수를 입력하세요.");
				eng[i] = sc.nextInt(); //영어
				System.out.println("수학 점수를 입력하세요.");
				math[i] = sc.nextInt(); //수학
				
				total[i] = lang[i]+eng[i]+math[i];
				avg[i] = (double)total[i]/3;
				}// for
			} else if(select==2) {
				System.out.println("전체 성적을 조회합니다.");
				for (i = 0; i < count; i++) {
					System.out.println("이름 : "+names[i]);
					System.out.println("번호 : "+numbers[i]);
					System.out.println("국어 : "+lang[i]);
					System.out.println("영어 : "+eng[i]);
					System.out.println("수학 : "+math[i]);
					System.out.println("총점 : "+total[i]);
					System.out.println("평균 : "+avg[i]);
					System.out.println("==========================");
				}//for
			}else if(select==3) {
				System.out.println("학생의 번호를 입력하세요.");
				int search = sc.nextInt();
				for(i = 0; i < 999; i++) {
					if (search==numbers[i]) {
						System.out.println("이름 : "+names[i]);
						System.out.println("번호 : "+numbers[i]);
						System.out.println("국어 : "+lang[i]);
						System.out.println("영어 : "+eng[i]);
						System.out.println("수학 : "+math[i]);
						System.out.println("총점 : "+total[i]);
						System.out.println("평균 : "+avg[i]);
						i = 999;
					}
				}
			}else {
				System.out.println("프로그램을 종료합니다.");
				check =! check;
				break;
			}//if
		}//while
		
	}// main

}// class
