package com.spring.aop.CGLIBDynamicProxy;

public class Test {

	public static void main(String[] args) {
		//�����������
		CglibProxy proxy = new CglibProxy();
		//target class
		UserDao userDao = new UserDao();
		//create target class proxy object
		UserDao proxyObject = (UserDao)proxy.createProxy(userDao);
		//use proxy object invoke method
		proxyObject.addUser("����");
		proxyObject.deleteUser();
	}

}
