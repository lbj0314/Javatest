package com.iu.lang.ex3;

public class StringEx1 {

	public static void main(String[] args) {
		
		String s1 = "mina,sana,momo.zuwei%nayeon^jeongyeon";
		s1 = s1.replace(".", ",");
		s1 = s1.replace("%", ",");
		s1 = s1.replace("^", ",");
//		System.out.println(s1);
		String [] names	= s1.split(",");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
