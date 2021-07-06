package com.spring.aop.CGLIBDynamicProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	//��������
	public Object createProxy(Object targetClass){
		Enhancer targetChild = new Enhancer();
		targetChild.setSuperclass(targetClass.getClass());//���ô�����ĸ���
		targetChild.setCallback(this);//��������������ִ�еķ���ָ������ǰ�����������ǿ
		return targetChild.create();//�����������
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
