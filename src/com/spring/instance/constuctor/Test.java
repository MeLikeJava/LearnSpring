package com.spring.instance.constuctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		/**
		 * spring�Ĺ�����ʵ����bean
		 * */
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
		NoParameterConstructor bean =  (NoParameterConstructor) applicationContext.getBean("noParameterConstructor");
		System.out.println(bean);
	}
}
