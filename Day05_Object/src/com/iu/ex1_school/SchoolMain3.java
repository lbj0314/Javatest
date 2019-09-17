package com.iu.ex1_school;

import java.util.Scanner;

import com.iu.ex1_school.Student2;

public class SchoolMain3 {

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
		// 배열 생성
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
			int i = 0;

			if(select==1) {
				System.out.println("학생의 수를 입력하세요.");
				select = sc.nextInt();
				students = new Student2[select];

				for(i = 0; i <students.length; i++) {	
					stu = new Student2();//새로운 학생 생성

					System.out.println("학생의 이름을 입력하세요.");
					stu.setName(sc.next()); // 이름
					System.out.println("학생의 번호를 입력하세요.");
					stu.setNumber(sc.nextInt()); //번호
					System.out.println("국어 점수를 입력하세요.");
					stu.setLang(sc.nextInt()); //국어
					System.out.println("영어 점수를 입력하세요.");
					stu.setEng(sc.nextInt()); //영어
					System.out.println("수학 점수를 입력하세요.");
					stu.setMath(sc.nextInt()); //수학

					stu.setTotal(stu.getLang() + stu.getEng() + stu.getMath());
					stu.setAvg((double)stu.getTotal()/3);

					students[i] = stu;

				}// for

			} else if(select==2) {
				System.out.println("전체 성적을 조회합니다.");
				for (i = 0; i <students.length; i++) {
					System.out.println("이름 : "+students[i].getName());
					System.out.println("번호 : "+students[i].getNumber());
					System.out.println("국어 : "+students[i].getLang());
					System.out.println("영어 : "+students[i].getEng());
					System.out.println("수학 : "+students[i].getMath());
					System.out.println("총점 : "+students[i].getTotal());
					System.out.println("평균 : "+students[i].getAvg());
					System.out.println("==========================");
				}//for

			}else if(select==3) {
				System.out.println("학생의 번호를 입력하세요.");
				select = sc.nextInt(); //검색할 학생의 번호
				boolean flag = false;//false면 못 찾은 것
				for(i = 0; i < students.length; i++) {
					if (select == students[i].getNumber()) {
						System.out.println("이름 : "+students[i].getName());
						System.out.println("번호 : "+students[i].getNumber());
						System.out.println("국어 : "+students[i].getLang());
						System.out.println("영어 : "+students[i].getEng());
						System.out.println("수학 : "+students[i].getMath());
						System.out.println("총점 : "+students[i].getTotal());
						System.out.println("평균 : "+students[i].getAvg());
						System.out.println("==========================");

						flag = true;
						break;
					}//if
				}//for
				if(flag) {
					System.out.println("해당 학생의 번호가 존재하지 않습니다.");
				}
			}else {
				System.out.println("프로그램을 종료합니다.");
				check =! check;
				break;
			}//if

		}//while


	}//main
}//class
