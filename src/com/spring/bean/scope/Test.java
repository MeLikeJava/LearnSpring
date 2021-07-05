package com.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] ages){
		String path = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
		//singleton
		Scope singleton1 = (Scope)applicationContext.getBean("singletonBean");
		Scope singleton2 = (Scope)applicationContext.getBean("singletonBean");
		System.out.println("scope=\"singleton\""+singleton1);
		System.out.println("scope=\"singleton\""+singleton2);
		//prototype
		Scope prototype1 = (Scope)applicationContext.getBean("prototypeBean");
		Scope prototype2 = (Scope)applicationContext.getBean("prototypeBean");
		System.out.println("scope=\"prototype\""+prototype1);
		System.out.println("scope=\"prototype\""+prototype2);
	}
}
