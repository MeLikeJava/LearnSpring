package com.spring.aop.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy implements InvocationHandler {
	//1、声明目标类
	private Object obj;
	//2、创建代理对象方法
	public Object createProxy(Object obj){
		this.obj = obj;
		//2.1 获取类加载器
		ClassLoader classLoader = JdkDynamicProxy.class.getClassLoader();
		//2.2 获取被代理对象的所有接口
		Class<?>[] clazz = obj.getClass().getInterfaces();
		//2.3 使用代理类，进行增强，返回的是代理后的对象
		return Proxy.newProxyInstance(classLoader, clazz, this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//声明切面
		MyAspect aspect = new MyAspect();
		//前增强
		aspect.check();
		//在目标类上调用方法，并传入参数
		Object returnValue = method.invoke(obj, args);
		//后增强
		aspect.log();
		return returnValue;
	}

}
