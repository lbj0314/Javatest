package com.iu.control4;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//fps - cs, overwatch, pubg
		
		for(int tan = 0; tan < 3; tan++) {
			System.out.println("1. 단발");
			System.out.println("2. 점사");
//			System.out.println("3. 연사");
			int mode = sc.nextInt();
			int i = 0;
			int a;
			int b;
			if(mode == 1) {
			
			}else if(mode == 2) {
				i = i*3;
			}
			
			for(i = 0; i < 30; i++) {
				if(mode == 1) {
					System.out.println("Tang");
				}else if(mode == 2) {
					i = i+2;
				System.out.println("Tatatang!");
				}
			
//				}else if(mode == 3) {
//					i = 30;
//				System.out.println("Tatatatatatatatatatatatatatatatatatata");
				
			}
		}
	}//main

}//class
