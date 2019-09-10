package com.iu.ex2_rpg;

import com.iu.ex2_rpg.Sword;

public class RpgMain {

	public static void main(String[] args) {
		//		객체생성
//		Sword s1 = new Sword();
//
//		s1.name = "단검";
//		s1.power = 10;
//		s1.level = 1;

//		System.out.println(s1.name);
//		System.out.println(s1.power);
//		System.out.println(s1.level);
		
		Knight k1 = new Knight();

		k1.name = "리체";
		k1.level = 99;
		k1.hp = 9999;
		k1.sword = new Sword();
		k1.sword.name = "단검";
		k1.sword.level = 1;
		k1.sword.power = 10;

		System.out.println(k1.name);
		System.out.println(k1.level);
		System.out.println(k1.hp);
		System.out.println(k1.sword.name);
		System.out.println(k1.sword.level);
		System.out.println(k1.sword.power);

	} //main

} // class
