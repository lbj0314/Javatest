package com.iu.control;

import java.util.Scanner;

public class Iftest4 {

	public static void main(String[] args) {
		//어떤 수를 가지고 홀,짝 판별하기
		//2로 나눈 나머지가 0이면 짝수 아니면 홀수
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}

}
