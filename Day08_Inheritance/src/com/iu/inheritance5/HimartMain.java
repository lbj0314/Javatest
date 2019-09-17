package com.iu.inheritance5;

public class HimartMain {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer computer = new Computer();
		Phone phone = new Phone();

		tv.brand = "Samsung";
		tv.size = 100;
		tv.color = "true color";
		tv.price = 10000000;
		tv.point = 100000;

		computer.brand = "Advence Micro Deviced";
		computer.cpu = "Ryzen 3800X";
		computer.price = 1500000;
		computer.point = 15000;

		phone.brand = "Samsung";
		phone.model = "Galaxy Note 10+";
		phone.color = "Aura glow";
		phone.price = 1300000;
		phone.point = 13000;

		Customer momo = new Customer();
		momo.money = 100000000;
		momo.point = 0;

		//		같은 데이터 타입을 모음

		Goods [] arr = new Goods[2];
		arr[0] = tv;
		arr[1] = computer;
		
		momo.buy(arr);




		System.out.println(tv.brand);
		System.out.println(tv.size+" inch");
		System.out.println(tv.color);
		System.out.println(tv.price+"원");
		System.out.println(tv.point+"점");
		System.out.println("------------------");

		System.out.println(computer.brand);
		System.out.println(computer.cpu);
		System.out.println(computer.price+"원");
		System.out.println(computer.point+"점");
		System.out.println("------------------");

		System.out.println(phone.brand);
		System.out.println(phone.model);
		System.out.println(phone.color);
		System.out.println(phone.price+"원");
		System.out.println(phone.point+"점");




	}

}
