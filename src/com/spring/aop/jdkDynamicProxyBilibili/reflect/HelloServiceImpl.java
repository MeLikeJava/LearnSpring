package com.spring.aop.jdkDynamicProxyBilibili.reflect;

public class HelloServiceImpl implements IHelloService {
	@Override
	public void sayHello(String name) {
		System.out.println("���ã�"+name);

	}

	@Override
	public String ask(String name, int age) {
		
		return "�������˵�����:"+name+"\040���䣺"+age;
	}
}
