package com.spring.aop.XMLAssembly;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class MyAspect implements MethodInterceptor,MethodBeforeAdvice,AfterReturningAdvice{
	public void check(){
		System.out.println("模拟检查权限");
	}
	public void log(){
		System.out.println("模拟日志记录");
	}
	@Override
	//环绕通知
	public Object invoke(MethodInvocation mi) throws Throwable {
		check();
		Object obj = mi.proceed();
		log();
		return obj;
	}
	@Override
	//前置通知
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("方法执行前");
		
	}
	@Override
	//后置通知
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("方法执行后");
	}
}
