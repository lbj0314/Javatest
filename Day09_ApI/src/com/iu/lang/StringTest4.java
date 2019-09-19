package com.iu.lang;

public class StringTest4 {

	public static void main(String[] args) {
		String s1 = "momo";
		String s2 = "momo";
		String s3 = new String("momo");
		String s4 = new String("momo");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));
		System.out.println(s3);
		
		String str1 = new String("momo");
		System.out.println(str1);
		str1 = str1+"sana";
		System.out.println(str1);
		
		System.out.println("1" + 1 + "abc");
		
		String str2 = "abcd";
		String str3 = str2.toUpperCase();
		System.out.println(str3);
		System.out.println(str2);
		
	}

}
