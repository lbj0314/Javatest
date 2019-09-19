package com.iu.lang2;

public class WrapperTest1 {
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.MAX_VALUE);
		
		Integer integer = new Integer(10);//"10"
		Integer integer2 = new Integer("10");
		int n1 = integer.intValue();
		int n2 = integer2.intValue();
		System.out.println(n1 + n2);
		n1 = integer;	//Auto Unboxing
		integer = n1; //Auto Boxing
		
		double a = 3.14;
		Double b = a;
		b = (double)n1;
		
		int n = Integer.parseInt("10");
		String s = "566.787";
		double ab = Double.parseDouble(s);
		
		
	}
}
