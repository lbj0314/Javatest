package com.iu.lang;

public class StringTest2 {

	public static void main(String[] args) {
		String str = "momo, sana, mina, zuwei";
		String [] names	= str.split(", ");//자르려고 하는 기준 문자열
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}
		
		str = "abcDEF";
		str = str.toLowerCase();
		System.out.println(str);
		
		str = str.toUpperCase();
		System.out.println(str);
	}

}
