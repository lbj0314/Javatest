package com.iu.lang.ex2;

import java.util.Scanner;

public class CharAtTest1 {
	Scanner sc = new Scanner(System.in);
	String str;

	@SuppressWarnings("unused")
	public void t4() {
		//파일명을 입력
		//이미지 파일 : jpg, gif, png, jpeg
//		sub string, indexOf
//		char [] img = {'', 'gif', 'png','jpeg'};
		System.out.println("파일명을 입력하세요.");
		str = sc.next();
		String [] img = new String[4];
		img[0] = "jpg";
		img[1] = "gif";
		img[2] = "png";
		img[3] = "jpeg";
		int index = 0;
		index = str.lastIndexOf(".");
		String s = str.substring(index+1);
//		System.out.println(index);
//		System.out.println(s);
		index++;
		for (int i = 0; i < img.length; i++) {
			if (img[i].equals(s)) {
				System.out.println("이미지 확장자입니다.");
				break;
			}else {
				System.out.println("이미지 확장자가 아닙니다.");
				break;
			}
			
		}
		
	}
	
	
	public void t3() {
		str = "Hello Java World Company Low legacy";
		//소문자 l(엘)이 몇개 있나 출력

		int index = 0;
		int count = 0;
		boolean check = true;
		while(check) {

			index = str.indexOf('e', index);
//			System.out.println(index);
			if (index == -1) {
				break;
			}
			index++;
			count++;
		}//while
		System.out.println("소문자의 갯수 : "+count);
	}

	public void t2() {
		//a -> c, b -> d, c -> e
		//aaabbb -> cccddd
		System.out.println("문자를 입력하세요.");
		str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int num = ch+2;
			ch = (char)num;
			System.out.print(ch);
		} //for	
	} //t2

	public void t1() {
		//문자열 입력 -- hello
		System.out.println("문자를 입력하세요.");
		str = sc.next();
		//한글자씩 출력
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}//for

	}//t1
}//class
