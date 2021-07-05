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
		//�����߼����÷���-->ʵ��������-->���÷���-->ִ�з���
		IHelloService s = new HelloServiceImpl();
		s.sayHello("newʵ����");
		
		//���÷�����Ƶ��÷���
		IHelloService target = new HelloServiceImpl();
		//ͨ���ӿڻ�ȡ��ΪsayHello��Method����
		Method sayHello = IHelloService.class.getMethod("sayHello", String.class);
		/**
		 * invoke��Method���е�һ����������ʾִ�з����ĵ���
		 * public Object invoke(Object obj, Object... args){}
		 * ������
		 * 		1��Object obj,��ʾ����ģ�Ҫִ���������ķ���
		 * 		2��Object... args,����ִ��ʱ�Ĳ���ֵ
		 * ����ֵObject������ִ�к�ķ���ֵ
		 * ͨ��Method�������ִ��sayHello()�ĵ���
		 * */
		sayHello.invoke(target, "�������\r"); 
		Method ask = IHelloService.class.getMethod("ask",String.class,int.class);
		String returnV = (String) ask.invoke(target,"������ӷ���ֵ",18);
		System.out.println(returnV);
	}

}
