package com.iot.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iot.spring.dev.Won;

public class Excute {

	public static void main(String[] args) {
//		Resource res = new ClassPathResource("beans.xml");
//		XmlBeanFactory bf = new XmlBeanFactory(res); //레이지로딩!
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml"); //프리로딩!!
		System.out.println("파싱완료??");
		Won m = (Won)ac.getBean("id");
		System.out.println(m);

	}
}