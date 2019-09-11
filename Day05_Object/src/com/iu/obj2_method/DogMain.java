package com.iu.obj2_method;

import java.util.Scanner;

public class DogMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("개의 크기를 입력하세요.");
		int size = sc.nextInt();
		System.out.println("횟수를 지정하세요.");
		int count = sc.nextInt(); //3
		
		 //매개 변수에 필요한 데이터
		dog.bark(size, count);//인자 값
	}

}
