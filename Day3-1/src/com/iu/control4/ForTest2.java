package com.iu.control4;

public class ForTest2 {

	public static void main(String[] args) {
		//2단부터 4단까지
		for (int i = 2; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i+" * "+j+" = "+i*j+"\t");
			}
			System.out.println();
		}
		

	}//main

}//class
