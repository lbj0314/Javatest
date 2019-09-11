package com.iu.obj2_method;

public class Dog {

	public void bark(int size, int count) {
		//매개변수 - 지역변수
		//대형견 - 퀑퀑 60 이상
		//중형견 - 뭥뭥 30 ~ 59
		//소형견 - 왈왈 29 이하
		String sound = null;

		if (size >= 60) {
			sound = "퀑퀑";
		} else if(size >= 30) {
			sound = "뭥뭥";
		} else if(size < 30) {
			sound = "왈왈";
		}//else if
		for(int i =0; i < count; i++) {
			System.out.println(sound);
		}
	}//bark


}//class
