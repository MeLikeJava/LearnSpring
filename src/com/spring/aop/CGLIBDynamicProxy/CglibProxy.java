package com.spring.aop.CGLIBDynamicProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	//创建代理
	public Object createProxy(Object targetClass){
		Enhancer targetChild = new Enhancer();
		targetChild.setSuperclass(targetClass.getClass());//设置代理类的父类
		targetChild.setCallback(this);//创建代理对象后，所执行的方法指定被当前类进行拦截增强
		return targetChild.create();//创建代理对象
	}
	@Override
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		MyAspect aspect = new MyAspect();
		aspect.check();
		Object obj = methodProxy.invokeSuper(proxy, args);
		aspect.log();
		return obj;
	}

}
