package com.iu.operator2;

import java.util.Scanner;

public class Operator7 {

	public static void main(String[] args) {
		// 수식 작성
		// 0 -> 0
		// 예 : 1 -> 1
		// 2 -> 2
		// 3 -> 3
		// 4 -> 10 (+6)
		// 5 -> 11 (+6)
		// 6 -> 12 (+6)
		// 7 -> 13 (+6)
		// 8 -> 20 (+12)
		// 9 -> 21 (+12)
		int input = 1;
		int output = 0;
		//4, 10 + - * / %
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		input = sc.nextInt();
		
		output = input/4 * 10 + input % 4;
		
		
		System.out.println("result :"+output);
		//System.out.println("result :"+output2);

	}

}
