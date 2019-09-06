package com.iu.control3;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		// 로그인, id, pw 입력하는 경우
		int id = 1234;//가입한 아이디
		int pw = 5678;//가입할때 쓴 암호
		//로그인 과정 최대 5번
		//로그인 성공시, 은행 업무 시작 출력
		//로그인 실패시, 바로 종료
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i <5; i++) {
			System.out.println("id를 입력하세요.");
			int cId = sc.nextInt();
			System.out.println("pw를 입력하세요.");
			int cPw = sc.nextInt();
			if(cId==id && cPw==pw) {
				i=5;
				System.out.println("로그인 성공! 은행 업무를 시작하세요.");
			}else {
				System.out.println("로그인 실패! id나 pw를 확인하세요.");

			}
			
		}
		System.out.println("프로그램을 종료합니다.");

	}//main

}//class
