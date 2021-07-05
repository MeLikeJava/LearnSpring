package com.spring.aop.jdkDynamicProxy;

public class Test {
	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		//创建代理对象
		JdkDynamicProxy jdkProxy = new JdkDynamicProxy();
		//创建目标对象
		UserDao userDao =  new UserDaoImpl();
		//从代理对象中获取增强后的目标对象
		UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
		//执行方法
		userDao1.addUser("张三");
		userDao1.deleteUser();
	}
}
