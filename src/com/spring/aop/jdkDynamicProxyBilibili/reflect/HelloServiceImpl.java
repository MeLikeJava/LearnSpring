package com.spring.aop.jdkDynamicProxyBilibili.reflect;

public class HelloServiceImpl implements IHelloService {
	@Override
	public void sayHello(String name) {
		System.out.println("您好！"+name);

	}

	@Override
	public String ask(String name, int age) {
		
		return "问问题人的姓名:"+name+"\040年龄："+age;
	}
}
