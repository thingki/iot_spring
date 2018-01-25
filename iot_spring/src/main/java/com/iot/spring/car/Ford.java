package com.iot.spring.car;

import org.springframework.stereotype.Component;

@Component
public class Ford implements Maker {

	@Override
	public void printName() {
		System.out.println("포드도 나온다 가즈아!");
	}

}
