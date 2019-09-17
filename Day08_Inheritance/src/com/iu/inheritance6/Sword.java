package com.iu.inheritance6;

public class Sword implements Weapon {
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		this.slash();
	}

	public void slash() {
		System.out.println("칼로 공격");
	}
}
