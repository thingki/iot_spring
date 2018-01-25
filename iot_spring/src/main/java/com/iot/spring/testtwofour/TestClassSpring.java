package com.iot.spring.testtwofour;

public class TestClassSpring implements TestInterface {

	@Override
	public String strMake(String str) {
		String str1= "나는 테스트의 스트링이다"+str;
		return str1;
	}

	@Override
	public void intMake() {
		System.out.println("뭐야야야");
	}

}
