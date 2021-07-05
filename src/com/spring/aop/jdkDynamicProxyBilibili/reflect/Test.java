package com.spring.aop.jdkDynamicProxyBilibili.reflect;

import java.lang.reflect.Method;

public class Test {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws Exception{
		//正常逻辑调用方法-->实例化对象-->调用方法-->执行方法
		IHelloService s = new HelloServiceImpl();
		s.sayHello("new实例化");
		
		//利用反射机制调用方法
		IHelloService target = new HelloServiceImpl();
		//通过接口获取名为sayHello的Method对象
		Method sayHello = IHelloService.class.getMethod("sayHello", String.class);
		/**
		 * invoke是Method类中的一个方法，表示执行方法的调用
		 * public Object invoke(Object obj, Object... args){}
		 * 参数：
		 * 		1、Object obj,表示对象的，要执行这个对象的方法
		 * 		2、Object... args,方法执行时的参数值
		 * 返回值Object：方法执行后的返回值
		 * 通过Method对象可以执行sayHello()的调用
		 * */
		sayHello.invoke(target, "反射调用\r"); 
		Method ask = IHelloService.class.getMethod("ask",String.class,int.class);
		String returnV = (String) ask.invoke(target,"多参数加返回值",18);
		System.out.println(returnV);
	}

}
