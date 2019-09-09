package com.iu.control4;

import java.util.Scanner;

public class ForTest7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		//로그인
		// while 로그인 검증
		boolean check = true;
		
		while (check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("id를 입력하세요.");
				int yId = sc.nextInt();
				System.out.println("pw를 입력하세요.");
				int yPw = sc.nextInt();
				if (yId == id && yPw == pw) {
					System.out.println("로그인 성공!");
					check = false;
				} else {
					System.out.println("id나 pw가 맞지 않습니다.");
				}//if2
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}//if1
			
		}//while
		
		if (!check) {
			System.out.println("게임을 시작합니다.");
			int level = 1;
			int gold = 0;
			
			for (level = 1; level < 15; level++) {
				if(level%5 == 0) {
					int g = level/5*1000;
					gold = gold + g;
					System.out.println(level+"레벨을 달성하여 "+g+"골드가 지급하였습니다.");
				}//if
				for(int mon = 1; mon < level*3; mon++) {
					System.out.println(mon + "마리 사냥");
				}//for2
				System.out.println("축하합니다! level이 "+(level+1)+"이/가 되었습니다.");
			}//for1
			System.out.println("축하합니다! 15 level이 되어 3,000골드가 지급되었습니다.");
			gold = gold + 3000;
			System.out.println("최종 레벨 : "+level);
			System.out.println("최종 골드 : "+gold);
		} else {

		}//if3
		
		//로그인이 성공했을때, 실행
		//게임 실행 - rpg -
		//레벨 1
		//골드 0
		//1-2 3
		//2-3 6
		//3-4 9
		//14-15 42마리
		//5에 1000골
		//10에 2000골
		//15에 3000골 지급
	}//main

}//class
