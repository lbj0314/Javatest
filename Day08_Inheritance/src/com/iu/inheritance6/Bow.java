package com.iu.inheritance6;

public class Bow implements Weapon{
	
	@Override
	public void attack() {
		this.shoot();
		
	}
	
	public void shoot() {
		System.out.println("활로 공격");
	}
}
