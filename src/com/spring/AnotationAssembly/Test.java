package com.spring.AnotationAssembly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		String path = "com/spring/AnotationAssembly/annotationAssembly.xml";
		ApplicationContext containner = new ClassPathXmlApplicationContext(path);
		UserController userController = (UserController)containner.getBean("userController");
		userController.save();
	}
}
