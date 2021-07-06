package com.spring.aop.CGLIBDynamicProxy;

public class Test {

	public static void main(String[] args) {
		//创建代理对象
		CglibProxy proxy = new CglibProxy();
		UserDao userDao = new UserDao();
		UserDao proxyObject = (UserDao)proxy.createProxy(userDao);
		proxyObject.addUser("张三");
		proxyObject.deleteUser();
	}

}
