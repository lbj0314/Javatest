package com.iu.control;

import java.util.Scanner;

public class Iftest10 {

	public static void main(String[] args) {
		//게임 
		//로그인
		//캐릭터
		int id = 1234; // 회원 가입했을 때,
		int pw = 5678; // 회원 가입했을 때,
		boolean sucess;
		//로그인 진행, id와 pw가 일치해야 함
		
		//캐릭터 선택  1.검사 2.마법사 3. 사제 그 외 다음 선택
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요.");
		int yId = sc.nextInt();
		System.out.println("pw를 입력하세요.");
		int yPw = sc.nextInt();
		
		if(yId==id && yPw==pw) {
			sucess = true;
			System.out.println("로그인에 성공하였습니다.");
		}else {
			sucess = false;
			System.out.println("id 또는 pw가 맞지 않습니다. 다시 입력해주세요.");
		}
		if(sucess == true) {
		System.out.println("캐릭터를 선택하세요.");
		System.out.println("1. 검사");
		System.out.println("2. 마법사");
		System.out.println("3. 사제");
		System.out.println("나머지. 다음에 선택");
		}
		
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("검사를 선택하셨습니다.");
		} else if(select == 2) {
			System.out.println("마법사를 선택하셨습니다.");
		} else if(select == 3) {
			System.out.println("사제를 선택하셨습니다.");
		} else {
			System.out.println("다음에 선택을 선택하셨습니다.");
		}
		System.out.println("프로그램이 종료하였습니다.");
	}
}


