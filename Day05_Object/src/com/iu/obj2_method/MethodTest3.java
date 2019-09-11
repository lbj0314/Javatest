package com.iu.obj2_method;

public class MethodTest3 {

	//가변으로 인자 값을 받고 싶을때
	public void info(int ... num) {
		// num = int[]
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		
	}//info

}//class
