package com.iu.lang.ex1;

public class MemberMain {

	public static void main(String[] args) {
		MemberLogin ml = new MemberLogin();
		
		Member member = ml.login();
		//출력 : 로그인 성공, 로그인 실패
		if(member != null) {
			System.out.println("로그인 성공");
		}
		
		
		
	}
	
	

}
