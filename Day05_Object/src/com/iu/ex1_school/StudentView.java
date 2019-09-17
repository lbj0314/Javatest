package com.iu.ex1_school;

public class StudentView {
	public void viewAll(Student2[] students) {

		System.out.println("전체 성적을 조회합니다.");
		for (int i = 0; i <students.length; i++) {
			this.viewOne(students[i]);
		}//for
	}//viewAll

	public void viewOne(Student2 student) {
		if(student != null) {
			System.out.println("이름 : "+student.getName());
			System.out.println("번호 : "+student.getNumber());
			System.out.println("국어 : "+student.getLang());
			System.out.println("영어 : "+student.getEng());
			System.out.println("수학 : "+student.getMath());
			System.out.println("총점 : "+student.getTotal());
			System.out.println("평균 : "+student.getAvg());
			System.out.println("==========================");
		}else {
			System.out.println("해당 학생의 번호가 존재하지 않습니다.");
		}
	}//viewOne

}//class



