package com.iu.ex1_school;

import java.util.Scanner;

import com.iu.ex1_school.Student2;

public class SchoolMain3_1 {

	public static void main(String[] args) {
		//		1. 성적입력
		//			학생의 수를 입력
		//			이름, 번호, 국어, 영어, 수학 점수 입력
		//		2. 전체조회
		//전체 정보 출력
		//		3. 학생 검색
		//학생의 번호 입력
		//해당 학생의 정보만 입력
		//		4. 프로그램 종료				

		Scanner sc = new Scanner(System.in);
		Student2 stu = new Student2();
		boolean check = true;
		//학생들을 담을 배열 생성
		Student2 [] students = null; // 값을 모르니 미리 선언

		
		
		while(check) {
			System.out.println("1. 성적 입력");
			System.out.println("2. 전체 조회");
			System.out.println("3. 학생 검색");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생의 수를 입력하세요.");
				select = sc.nextInt();
				students = new Student2[select];//select 만큼 배열 크기 조절

				for (int i = 0; i < students.length; i++) {
					stu = new Student2();//새로운 학생 생성
					
					System.out.println("학생의 이름을 입력하세요.");
					stu.name = sc.next(); // 이름
					System.out.println("학생의 번호를 입력하세요.");
					stu.number = sc.nextInt(); //번호
					System.out.println("국어 점수를 입력하세요.");
					stu.lang = sc.nextInt(); //국어
					System.out.println("영어 점수를 입력하세요.");
					stu.eng = sc.nextInt(); //영어
					System.out.println("수학 점수를 입력하세요.");
					stu.math = sc.nextInt(); //수학

					stu.total = stu.lang + stu.eng + stu.math;
					stu.avg = (double)stu.total/3;
					
					students[i] = stu;
				}
				break;
			case 2:
				System.out.println("전체 성적을 조회합니다.");
				for (int i = 0; i <students.length; i++) {
					System.out.println("이름 : "+students[i].name);
					System.out.println("번호 : "+students[i].number);
					System.out.println("국어 : "+students[i].lang);
					System.out.println("영어 : "+students[i].eng);
					System.out.println("수학 : "+students[i].math);
					System.out.println("총점 : "+students[i].total);
					System.out.println("평균 : "+students[i].avg);
					System.out.println("==========================");
				}//for
				break;
			case 3:
				System.out.println("학생의 번호를 입력하세요.");
				int search = sc.nextInt();
				for(int i = 0; i < students.length; i++) {
					if (search==stu.number) {
						System.out.println("이름 : "+stu.name);
						System.out.println("번호 : "+stu.number);
						System.out.println("국어 : "+stu.lang);
						System.out.println("영어 : "+stu.eng);
						System.out.println("수학 : "+stu.math);
						System.out.println("총점 : "+stu.total);
						System.out.println("평균 : "+stu.avg);
						System.out.println("==========================");
					}
				}
				break;
			default:
				System.out.println("4. 종료");
				check = false;

			}//switch case
		}//while

	}//main
}//class
