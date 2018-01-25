package com.iot.spring.testtwofour;

public class TestClassSpring2 implements TestInterface {
	

	@Override
	public String strMake(String str) {
		String str2= "나는 테스트1의 스트링이다" +str;
		return str2;
	}

	@Override
	public void intMake() {
		System.out.println("DFD");
	}

}
