package com.iu.ex1_school;

import java.util.Scanner;

public class SchoolMenu {
	//메뉴 선택하는 클래스

	//메서드명은 start
	//선택 메뉴가 실행
	public void start() {
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

		boolean check = true;
		//학생들을 담을 배열 생성
		Student2 [] students = null; // 값을 모르니 미리 선언
		//전체 학생 조회 객체 생성
		StudentView view = new StudentView();
		//번호 일치한 학생 조회 객체 생성
		StudentView search = new StudentView();
		//학생 번호 찾기
		StudentInput input = new StudentInput();


		while(check) {
			System.out.println("1. 성적 입력");
			System.out.println("2. 전체 조회");
			System.out.println("3. 학생 검색");
			System.out.println("4. 학생 삭제");
			System.out.println("5. 프로그램 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				students = input.makeStudents();
				break;
			case 2:
				view.viewAll(students);
				break;
			case 3:
				//findByNum이 실행되어야 함
				Student2 student = input.findByNum(students);
				search.viewOne(student);

				break;
			case 4:
				System.out.println("학생이 삭제 코드 실행");
				student = input.deleteStudent(students);
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				check = false;

			}//switch case
		}//while
	}



}
