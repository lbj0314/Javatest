package com.iu.ex1_school;

import java.util.Scanner;

public class StudentInput {

	//메서드 명은 findByNum
	//번호를 스캐너로 입력 받아서 학생들 중에 한명을 찾아서 출력
	public Student2 findByNum(Student2[] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 번호를 입력하세요.");
		int select = sc.nextInt(); //검색할 학생의 번호
		
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

}
