package com.iot.spring.car;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component("aaa")
@Order(value=2)
public class Audi implements Maker{

	@Override
	public void printName() {
		System.out.println("아우디가 나온다!");

	}
	
}
