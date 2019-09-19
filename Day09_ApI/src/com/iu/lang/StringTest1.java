package com.iu.lang;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		
		String str = "abc";
		
		String str2 = new String("abc");
		
		System.out.println(str == str2);
		
		boolean check = str.equals(str2);
		
		System.out.println(check);
		
		
		String str3 = "HelloJava";
		String str4 = new String("");
		//charArt 사용하고 출력
		//멤버 메서드 : 참조변수명.메서드명
	
		char ch =str3.charAt(0);
		System.out.println(ch);
		//indexOf 사용하고 출력
		
		int idx1 = str3.indexOf('H', 3);
		int idx2 = str3.indexOf("Java");
		System.out.println(idx1);
		System.out.println(idx2);
		
		str = "Hello Java World Company Low legacy";
		str = str.replace('l', 'L');
		System.out.println(str);
		str = str.replace("Java", "Game");
		System.out.println(str);
		
		String sub = str.substring(6, 10);
		System.out.println(sub);
	}

}
