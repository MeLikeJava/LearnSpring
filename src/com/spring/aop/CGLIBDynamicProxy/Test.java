package com.spring.aop.CGLIBDynamicProxy;

public class Test {

	public static void main(String[] args) {
		//�����������
		CglibProxy proxy = new CglibProxy();
		UserDao userDao = new UserDao();
		UserDao proxyObject = (UserDao)proxy.createProxy(userDao);
		proxyObject.addUser("����");
		proxyObject.deleteUser();
	}

}
