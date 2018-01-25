package com.iot.spring.car;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String name;
	private String age;
	private String address;
	private String money;
	
	@Override
	public String toString() {
		return "Customer [address=" + address + ", age=" + age + ", money=" + money + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
}
