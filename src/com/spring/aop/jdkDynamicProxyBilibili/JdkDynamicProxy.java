package com.spring.aop.jdkDynamicProxyBilibili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//完成代理类的功能(1、调用目标方法 2、功能增强)
public class JdkDynamicProxy implements InvocationHandler {
	private IUsbSell targetObj;
	public Object createProxy(IUsbSell obj){
		this.targetObj = obj;
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class<?>[] interfaces  = obj.getClass().getInterfaces(); 
		System.out.println(interfaces);
		return Proxy.newProxyInstance(classLoader, interfaces, this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Aspect a = new Aspect();
		float price = (float) method.invoke(targetObj, args);
		price = price + 25.0f;
		return a.totalPrice(args, price);
	}

}
