package com.iu.inheritance6;

public class Main {

	public static void main(String[] args) {
		Knight knight = new Knight();
		Sword sword = new Sword();
		Bow bow = new Bow();
		
		knight.weapon = sword;
		
		knight.weapon.attack();
		
		knight.weapon = bow;
		
		knight.weapon.attack();

		
	}

}
