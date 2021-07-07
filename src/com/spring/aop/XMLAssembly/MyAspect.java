package com.spring.aop.XMLAssembly;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class MyAspect implements MethodInterceptor,MethodBeforeAdvice,AfterReturningAdvice{
	public void check(){
		System.out.println("ģ����Ȩ��");
	}
	public void log(){
		System.out.println("ģ����־��¼");
	}
	@Override
	//����֪ͨ
	public Object invoke(MethodInvocation mi) throws Throwable {
		check();
		Object obj = mi.proceed();
		log();
		return obj;
	}
	@Override
	//ǰ��֪ͨ
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("����ִ��ǰ");
		
	}
	@Override
	//����֪ͨ
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("����ִ�к�");
	}
}
