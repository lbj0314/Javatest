package com.iu.mod1;

public class MemberMain2 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.setAge(24);
		member.setName("sana");
//		member.tall = 1.65;
		double t = 165.3;
		member = new Member("sana", 24, 165.3);
		
		member.setTall(168.3);
		
		member.info();
		
		System.out.println("Tall : "+ member.getTall());

	}

}
