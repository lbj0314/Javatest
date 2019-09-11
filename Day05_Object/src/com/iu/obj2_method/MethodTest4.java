package com.iu.obj2_method;

public class MethodTest4 {

	public int info(int num1, int num2) {
		int sum = num1 + num2;
		String name = "sum";
		return sum;
	
//		System.out.println(sum);
		
	}//info
	//sale
	//금액을 받아서 20% 할인된 가격으로 리턴
	public int sale(int price) {
		int result = 0;
		result = price-(price*2/10);
		result = result-(result*2/10);
		
		return result;
	}
	
	
	
}//class
