package com.iot.spring;

public class HelloSpring {
	
	private String msg;
	private String name;
	
	public HelloSpring() {
		System.out.println("hello spring");
	}
	public void setMessage(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return this.msg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
