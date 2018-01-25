package com.iot.spring.car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	@Autowired
	@Qualifier("kkk")
	private Maker m;
	
	@Autowired
	private List<Maker> mList;
	
	@Autowired
	@Qualifier("ford")
	private Maker audi;
	
	public void printMaker() {
		System.out.println(m);
		m.printName();
	}
	
	public void printMList() {
		for(Maker m : mList) {
			m.printName();
		}
	}
	
	public void printtest1() {
		audi.printName();
	}
	
	public Customer setCustomer(Customer c, HongGu hong) {
//		c.setName(hong.get("name"));
//		c.setAge(hong.get("age"));
//		c.setAddress(hong.get("address"));
//		c.setMoney(hong.get("money"));
//		
		return c;
		
	}
}
