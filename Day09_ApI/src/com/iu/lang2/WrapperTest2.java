package com.iu.lang2;

import java.util.Scanner;

public class WrapperTest2 {

	public static void main(String[] args) {
		//회원가입
		//비밀번호 입력
		//최소 8글자 이상
		//대문자 2개 이상
		//소문자 2개 이상
		//숫자 1개 이상
		//공백 없이
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		boolean check = true;
		while(check) {
			//			System.out.println("id를 입력하세요.");
			//			String id = sc.next();
			System.out.println("pw를 입력하세요.");
			String pw = sc.nextLine();


			if (pw.length() < 8) {
				System.out.println("비밀번호를 8자리 이상 입력하세요.");
			}
			for (int i = 0; i < pw.length(); i++) {
				char ch = pw.charAt(i);
				//				System.out.println(pw.charAt(i));

				if (Character.isUpperCase(ch)) {
					a++;
					
				}else if(Character.isLowerCase(ch)) {
					b++;
					
				}else if(Character.isDigit(ch)) {
					c++;
					
				}else if(Character.isWhitespace(ch)) {
					d++;
					
				}	
			}// for
			if (a > 1 && b > 1 && c > 0 && d == 0 ) {
				System.out.println("비밀번호 생성완료.");
				break;
			}else {
				System.out.println("비밀번호 다시 입력하세요.");
			}
		}//while
	}//main

}//class
