package com.iu.obj2;

public class Computer {
	String cpu = "AMD 3800X";
	int ssd = 256;
	
	public void computer() {
		this.cpu = "i9 9900k";
		this.ssd = 1024;
	}
	
	public void info() {
		System.out.println("cpu : " + this.cpu);
		System.out.println("ssd : " + this.ssd );
		
	}
	
	
}
