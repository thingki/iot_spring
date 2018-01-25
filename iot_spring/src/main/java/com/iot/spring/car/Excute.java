package com.iot.spring.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Excute {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("car/ioc.xml");
		Order m = (Order)ac.getBean("order");
		System.out.println(m);
		m.printMList();
		Order o2=(Order)ac.getBean("order");
		o2.printtest1();
	}
}