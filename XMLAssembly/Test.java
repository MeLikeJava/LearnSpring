package com.spring.aop.XMLAssembly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		String path = "com/spring/aop/XMLAssembly/aop.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(path);
		IUserDao user = (IUserDao)app.getBean("proxyUserDao");
		Boolean add = user.addUser("ÕÅÈý");
		System.out.println(add);
		String delete = user.deleteUser(5000);
		System.out.println(delete);
	}

}
