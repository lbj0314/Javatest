package com.iu.obj1;

public class ObjectMain2 {

	public static void main(String[] args) {
		int [] nums;
//		System.out.println(nums); 모든 변수는 사용하려면 초기화해야 된다.
//		지역 변수의 초기화는 개발자가 직접해야 함
		nums = new int[3];
		
//		Heap 영역에 만들어지는 변수는
//		개발자가 초기화 하지 않으면 반자동으로
//		초기화 됨.
		
//		초기값
//		레퍼런스 타입은 null 로 초기화
		
		String[] names = new String[2];
		
		System.out.println(names[0]);
		
		
		System.out.println(nums[0]);
		
		
	}

}
