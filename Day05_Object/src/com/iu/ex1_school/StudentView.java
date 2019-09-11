package com.iu.ex1_school;

public class StudentView {
	public void viewAll(Student2[] students) {

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
	}//viewAll

	public void viewOne(Student2 student) {
		if(student != null) {
			System.out.println("이름 : "+student.name);
			System.out.println("번호 : "+student.number);
			System.out.println("국어 : "+student.lang);
			System.out.println("영어 : "+student.eng);
			System.out.println("수학 : "+student.math);
			System.out.println("총점 : "+student.total);
			System.out.println("평균 : "+student.avg);
			System.out.println("==========================");
		}else {
			System.out.println("해당 학생의 번호가 존재하지 않습니다.");
		}
	}//viewOne

}//class



