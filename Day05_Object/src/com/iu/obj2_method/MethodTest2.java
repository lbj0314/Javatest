package com.iu.obj2_method;

public class MethodTest2 {
	
	public void info1(int[] nums) {
		//n개의 정수를 받아서 합계와 평균
		int total = 0;//합계을 담을 변수
		double avg = 0;//평균을 담을 변수
		for (int i = 0; i < nums.length; i++) {
//			nums = new int[count];
//			nums[i] = total;
			total = total+nums[i];
		}
		avg = (double) total/nums.length;
		System.out.println("합계는 "+total+" 입니다.");
		System.out.println("평균은 "+avg+" 입니다.");
		
//		nums[0] = 51;
//		nums[1] = 52;
		System.out.println(nums);
		
//		새로운 배열이 생성되어 다른 주소값 생성
		nums = new int[2];
		nums[0] = 100;
		nums[1] = 200;
		System.out.println(nums);
	}//info1
	
}//class
