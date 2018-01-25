package com.iot.spring.car;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("kkk")
@Order(value=1)

//@Scope("prototype") 생성자 계속 생성함!!
public class Kia implements Maker{
	
	
	public void printName() {
		System.out.println("기아차가 나온다!");
	}
	

}
