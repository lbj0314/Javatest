package com.iu.lang;

public class StringTest3 {

	public static void main(String[] args) {
		String str1 = "momo";
		String str2 = "momo ";
		
		str1 = str1.trim();
		str2 = str2.trim();
		str2 = str2.replace(" ", "");
		System.out.println(str1.equals(str2));
		
		String n = str1.valueOf(10);
		System.out.println(n);
		

	}

}
