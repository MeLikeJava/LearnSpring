package com.spring.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args){
		ApplicationContext applictionContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean bean = (Bean)applictionContext.getBean("staticFactory");
		System.out.println(bean);
	}
}
