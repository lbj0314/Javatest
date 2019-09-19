package com.iu.lang.ex1;

import java.util.Scanner;

public class MemberLogin {

	public Member login() {
		//id와 pw를 입력 받아서 로그인 성공하면 해당 Member 리턴
		MemberMaker mk = new MemberMaker();
		Member[] m = mk.getMembers();

		Scanner sc = new Scanner(System.in);

		System.out.println("id를 입력하세요.");
		String id = sc.next();
		System.out.println("pw를 입력하세요.");
		String pw = sc.next();
	
		Member member = null;
	
		for (int i = 0; i < m.length; i++) {
		
			if (m[i].getId().equals(id) && m[i].getPw().equals(pw)) {
				member = m[i];
				break;
			}//if
		}//for
		return member;

	}// login

}// MemberLogin class
