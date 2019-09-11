package com.iu.obj2_method;

public class MethodMain4 {

	public static void main(String[] args) {
		MethodTest4 met4 = new MethodTest4();
		
		int num = met4.info(10, 20);
		
		System.out.println(num);
		
		int price = 20000;
		
		price = met4.sale(price);
		
		System.out.println(price);
		
	}

}
