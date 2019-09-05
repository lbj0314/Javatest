package com.iu.control;

import java.util.Scanner;

public class Iftest7 {

	public static void main(String[] args) {
		//국어 영어 수학 입력
		//총점 계산
		//평균이 90점 이상이면 A
		//80점 이상이면 B
		//70점 이상 C
		//60점 이상 D
		//그외 F
		Scanner sc = new Scanner(System.in);
		int lang = 0;
		System.out.println("국어 점수를 입력하세요.");
		lang = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = 0;
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = 0;
		math = sc.nextInt();
		int total;
		int avg;
		total = lang+eng+math;
		avg = total/3;
		String result="";
		if (avg >= 90) {
			result="Grade는 A입니다.";
			//System.out.println("Grade는 A입니다.");
		} else if(avg >= 80){
			result="Grade는 B입니다.";
			//System.out.println("Grade는 B입니다.");
		} else if(avg >= 70){
			result="Grade는 C입니다.";
			//System.out.println("Grade는 C입니다.");
		} else if(avg >= 60){
			result="Grade는 D입니다.";
			//System.out.println("Grade는 D입니다.");
		} else {
			result="Grade는 F입니다.";
			//System.out.println("Grade는 F입니다.");
		}
		System.out.println(result);
	}

}
