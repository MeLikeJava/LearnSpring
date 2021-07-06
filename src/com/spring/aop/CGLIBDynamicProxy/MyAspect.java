package com.spring.aop.CGLIBDynamicProxy;
//切面类：此类中可以声明多个advice(即多个增强方法)
public class MyAspect {
	public void check(){
		System.out.println("模拟权限检查");
	}
	public void log(){
		System.out.println("模拟日志记录");
	}
}
