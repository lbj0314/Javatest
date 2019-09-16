package com.iu.ex1_school;

import java.util.Scanner;

public class StudentInput {
	Scanner sc = new Scanner(System.in);
	
	//메서드 명은 findByNum
	//번호를 스캐너로 입력 받아서 학생들 중에 한명을 찾아서 출력
	public Student2 findByNum(Student2[] students) {
		int select = 0;
		System.out.println("학생의 번호를 입력하세요.");
		select = sc.nextInt(); //검색할 학생의 번호

		Student2 student = null;

		for (int i = 0; i < students.length; i++) {
			if(select == students[i].number) {
				student = students[i];
				break;
			}

			//		int i = 0;
			//		boolean flag = false;//false면 못 찾은 것
			//		for(i = 0; i <students.length; i++) {
			//			if (select == students[i].number) {
			//				
			//
			////				flag = true;
			//				break;
		}//if
		//		}//for
		//		if(!flag) {
		//			System.out.println("해당 학생의 번호가 존재하지 않습니다.");
		//		}
		return student;
	}// findByNum
	//makeStudents
	public Student2[] makeStudents() {
		int select = 0;
		System.out.println("학생의 수를 입력하세요.");
		select = sc.nextInt();
		Student2 [] students = new Student2[select];//select 만큼 배열 크기 조절

		for (int i = 0; i < students.length; i++) {

			Student2 stu = new Student2();//새로운 학생 생성

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
		}//for
		return students;
	}//makeStudents

	public Student2 deleteStudent(Student2[] students) {
		int select = 0;
		Student2 student = null;


		System.out.println("삭제할 학생의 번호를 입력하세요.");
		select = sc.nextInt(); //검색할 학생의 번호
		int index = 0;
		for(index = 0; index < students.length; index++) {
			if(select == students[index].number) {
				break;
			}
		}

		Student2 [] students2 = new Student2[students.length-1];
		int idx = 0; //students2 의 인덱스
		for (int i = 0; i <= students2.length; i++) {
			if(index == i) {
				continue;
			}
			students2[idx] = students[i];
			idx++;
		}
		students[select].name = students2[select].name;
		students[select].number = students2[select].number;
		students[select].lang = students2[select].lang;
		students[select].eng = students2[select].eng;
		students[select].math = students2[select].math;
		students[select].total = students2[select].total;
		students[select].avg = students2[select].avg;
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}//for

		return student;
	}//deleteStudent

	//	return student;

}
