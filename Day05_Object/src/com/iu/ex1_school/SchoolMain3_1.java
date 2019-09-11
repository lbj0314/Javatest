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
		//전체 학생 조회 객체 생성
		StudentView view = new StudentView();
		//번호 일치한 학생 조회 객체 생성
		StudentView search = new StudentView();
		StudentInput input = new StudentInput();
		
		
		
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
				view.viewAll(students);
				break;
			case 3:
				//findByNum이 실행되어야 함
				Student2 student = input.findByNum(students);
				search.viewOne(student);
				
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				check = false;

			}//switch case
		}//while

	}//main
}//class
