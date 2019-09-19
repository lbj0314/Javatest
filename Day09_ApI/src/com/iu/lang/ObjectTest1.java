package com.iu.lang;

public class ObjectTest1 {
	public static void main(String[] args) {

		Object obj = new Object();

		obj.toString();
		
		String str = obj.toString();
		
		System.out.println(str);
		System.out.println(obj);
		
		Member m1 = new Member();
		Member m2 = new Member();
		
		m1.age = 10;
		m1.num = 1;
		
		m2.age = 15;
		m2.num = 1;
		
		boolean check = m1.equals(m2);
		System.out.println(check);
		
		m1.toString();
		System.out.println(m1);
		
		int num = m1.hashCode();
		System.out.println(num);
		
		
		System.out.println(String.CASE_INSENSITIVE_ORDER); 
		
		
	}
	
//	public String toString() {
//		return null;
//		
//	}
}
