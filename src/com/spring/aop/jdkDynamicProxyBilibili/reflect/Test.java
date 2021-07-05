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
		s.ask("newʵ����", 20);
		
		//���÷�����Ƶ��÷���
		IHelloService target = new HelloServiceImpl();
		//ͨ���ӿڻ�ȡ��ΪsayHello��Method����
		Method sayHello = IHelloService.class.getMethod("sayHello", String.class);
		/**
		 * invoke��Method���е�һ����������ʾִ�з����ĵ���
		 * public Object invoke(Object obj, Object... args){}
		 * ������
		 * 		1��Object obj,��ʾ����ģ�Ҫִ���������ķ���
		 * 		2��Object... args,����ִ��ʱ�Ĳ���ֵ,�����ǰ�˳��������д��Ҳ����ֱ��ʹ�ö���
		 * ����ֵObject������ִ�к�ķ���ֵ
		 * ͨ��Method�������ִ��sayHello()�ĵ���
		 * */
		sayHello.invoke(target, "�������\r"); 
		Method ask = IHelloService.class.getMethod("ask",String.class,int.class);
		String returnV = (String) ask.invoke(target,"������ӷ���ֵ",18);
		System.out.println(returnV);
	}
	@org.junit.Test
	public void test(){
		System.out.println("getClass()-->�����"+new Test().getClass());
		System.out.println("this.getClass()-->�����"+this.getClass());
		System.out.println(".class-->�����"+Test.class);
	}
}
