package com.iot.spring.work;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iot.spring.dev.Won;

public class Excute {
	private Worker w;
	
	public Excute(Worker w) {
		this.w=w;
	}
	public void setWorker(Worker w) {
		this.w=w;
	}
	public Worker getWorker() {
		return this.w;
	}
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("work/WorkBeans.xml"); //프리로딩!!
		System.out.println("파싱완료??");
		Excute e = (Excute)factory.getBean("ex");
		e.getWorker().goOffWork();;
		PrintWorker e1 = (PrintWorker)factory.getBean("print");
		e1.printWorkers();
	}
}
