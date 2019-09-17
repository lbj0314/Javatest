package com.iu.inheritance5;

import java.util.Scanner;

public class Customer{
	int money;
	int point;
//	boolean check = false;
	//메서드명은 buy
	//물건 값을 계산, 남아있는 금액, 포인트 출력

	//	Customer momo = new Customer();
	//	Tv tv = new Tv();
	//	Computer computer = new Computer();
	//	Phone phone = new Phone();

	public void buy(Goods g) {
		this.money = this.money - g.price;
		this.point = this.point + g.point;
		System.out.println("사고 남은 돈 : "+this.money+"원");
		System.out.println("남은 포인트 : "+this.point+"점");
	}
	//		while(check == true) {
	//			Scanner sc = new Scanner(System.in);
	//			System.out.println("구매하실 물건의 번호를 입력하세요.");
	//			System.out.println("1번 : TV");
	//			System.out.println("2번 : Computer");
	//			System.out.println("3번 : Phone");
	//			int select = sc.nextInt();
	//			if (select == 1) {
	//				momo.money = momo.money - tv.price;
	//				momo.point = momo.point + tv.point;
	//			} else if(select == 2) {
	//				momo.money = momo.money - computer.price;
	//				momo.point = momo.point + computer.point;
	//			} else if(select == 3) {
	//				momo.money = momo.money - phone.price;
	//				momo.point = momo.point + phone.point;
	//			} else {
	//				check = !check;
	//			}
	//		}
	//		System.out.println(momo.money);
	//		System.out.println(momo.point);
	
//	buy 1개 이상의 물품 구입, 매개 변수 1개
	//물건 값을 계산, 남아있는 금액, 포인트 출력
	public void buy(Goods[] arr) {
	
		for (int i = 0; i < arr.length; i++) {
//			if (arr [i] == null) {
//				break;
//			}
			this.money -= arr[i].price;
			this.point += arr[i].point;
			arr [i++] = arr[i];
		}
		System.out.println(this.money);
		System.out.println(this.point);
	}
	
}
