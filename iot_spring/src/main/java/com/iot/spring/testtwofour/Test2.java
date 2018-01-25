package com.iot.spring.testtwofour;

public class Test2 {
	private String str2;
	private String str3;
	

	public void setTestStr1(String[] str) {
		this.str2=str[0];
		this.str3=str[1];
	}

//	public void setTestStr2(String str) {
//		this.str3=str;
//	}
	public void printTest() {
		System.out.println(str2+str3);
	}
}
