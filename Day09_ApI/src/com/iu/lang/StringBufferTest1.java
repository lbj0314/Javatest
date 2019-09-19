package com.iu.lang;

public class StringBufferTest1 {

	public static void main(String[] args) {
		String str1 = "momo";
		String str2 = "sana";
		str1 = str1 + str2;
		
		StringBuffer sb = new StringBuffer();
		sb.append("momo");
		sb.append("sana");
		
		System.out.println(sb);
		
		str1 = sb.toString();
		System.out.println(str1);
	}

}
