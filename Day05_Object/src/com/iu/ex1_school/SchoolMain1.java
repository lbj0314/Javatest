package com.iu.ex1_school;

import java.util.Scanner;

import com.iu.ex1_school.Student;

public class SchoolMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu = null;


		System.out.println("학생의 수를 입력하세요.");
		int count = sc.nextInt();
		
		// 배열 생성
		Student[] students = new Student[count];
		
		int i = 0;
		for(i = 0; i < students.length; i++ ) {
//			stu = new Student();
//			데이터를 입력하고
			students[i] = new Student();
			
			System.out.println("학생의 이름을 입력하세요.");
//			students[i].name = sc.next(); nullpointerException 에러 발생
			stu.name = sc.next();
			System.out.println("학생의 번호를 입력하세요.");
			stu.number = sc.nextInt();
			System.out.println("국어 점수를 입력하세요.");
			stu.lang = sc.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			stu.eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요.");
			stu.math = sc.nextInt();
			stu.total = stu.lang + stu.eng + stu.math;
			stu.avg = (double) stu.total/3;

			students[i] = stu;

		}
		for(i = 0; i < students.length; i++) {
			
			System.out.println("학생 이름 : "+ students[i].name);
			System.out.println("학생 번호 : "+ students[i].number);
			System.out.println("국어 점수 : "+ students[i].lang);
			System.out.println("영어 점수 : "+ students[i].eng);
			System.out.println("수학 점수 : "+ students[i].math);
			System.out.println("총점 점수 : "+ students[i].total);
			System.out.println("평균 점수 : "+ students[i].avg);
			System.out.println("==========================");
		}

	}

}
