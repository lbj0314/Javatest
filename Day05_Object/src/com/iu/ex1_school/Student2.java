package com.iu.ex1_school;

public class Student2 {
//	성적 관리 프로그램
//	국어, 영어, 수학, 이름, 번호, 총점, 평균
	
	private String name; // 학생 이름
	private int number; // 번호
	private int lang; // 국어 점수
	private int eng; // 영어 점수
	private int math; // 수학 점수
	private int total; // 총 점수
	private double avg; // 평균 점수
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
}//class
