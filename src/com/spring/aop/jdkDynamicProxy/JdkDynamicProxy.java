package com.spring.aop.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy implements InvocationHandler {
	//1������Ŀ����
	private Object obj;
	//2������������󷽷�
	public Object createProxy(Object obj){
		this.obj = obj;
		//2.1 ��ȡ�������
		ClassLoader classLoader = JdkDynamicProxy.class.getClassLoader();
		//2.2 ��ȡ�������������нӿ�
		Class<?>[] clazz = obj.getClass().getInterfaces();
		//2.3 ʹ�ô����࣬������ǿ�����ص��Ǵ����Ķ���
		return Proxy.newProxyInstance(classLoader, clazz, this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//��������
		MyAspect aspect = new MyAspect();
		//ǰ��ǿ
		aspect.check();
		//��Ŀ�����ϵ��÷��������������
		Object returnValue = method.invoke(obj, args);
		//����ǿ
		aspect.log();
		return returnValue;
	}

}
