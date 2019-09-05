package com.iu.control2;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점, 평균 계산
		//평균이 90점 이상이면 A
		//80점 B
		//70점 C
		//60점 D
		//그 이하 F
		int lang;
		int eng;
		int math;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		lang = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		math = sc.nextInt();
		total = lang+eng+math;
		int avg = total/3;
		
//		 switch (avg) { 
//		 case 100: case 99: case 98: case 97: case 96: case 95: 
//		 case 94: case 93: case 92: case 91: case 90: 
//			 System.out.println("A"); 
//			 break; 
//		 case 89: case 88: case 87: case 86: case 85: 
//		 case 84: case 83: case 82: case 81: case 80: 
//			 System.out.println("B"); 
//				 break; 
//		 case 79: case 78: case 77: case 76: case 75: 
//		 case 74: case 73: case 72: case 71: case 70:
//			 System.out.println("C"); 
//			 break; 
//		 case 69: case 68: case 67: case 66: case 65:
//		 case 64: case 63: case 62: case 61: case 60: 
//			 System.out.println("D"); 
//			 break;
//		 default: 
//			 System.out.println("F"); 
//			 break; 
//			 }
		 
		switch (avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}

}
