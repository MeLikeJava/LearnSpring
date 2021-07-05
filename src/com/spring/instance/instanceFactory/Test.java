package com.spring.instance.instanceFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean bean = (Bean)applicationContext.getBean("instanceBean");
		System.out.println(bean);
	}
}
