package com.spring.XMLAssembly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于XML装配的两种方式：
 * 1、set注入
 * 2、构造注入
 * */
public class Test {
	public static void main(String[] args){
		String path = "com/spring/XMLAssembly/XMLAssembly.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
		User user1 = (User)applicationContext.getBean("user1");
		System.out.println(user1);
		User user2 = (User)applicationContext.getBean("user2");
		System.out.println(user2);
	}
}
