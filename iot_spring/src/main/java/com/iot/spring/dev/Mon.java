package com.iot.spring.dev;

import org.springframework.stereotype.Component;

@Component//("id")라고 하면 키값이 생김!! 아니면 클래스이름!
public class Mon implements Money{
	private int Money;
	public Mon() {
		System.out.println("원이 생성딤!!");
	}
	@Override
	public void setMoney(int money) {
		this.Money=money;
	}

	@Override
	public int getMoney() {
		return Money;
	}
	public String toString() {
		return "총 액 : " +this.Money;
	}

}
