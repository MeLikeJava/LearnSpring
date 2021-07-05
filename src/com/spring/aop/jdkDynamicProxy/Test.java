package com.spring.aop.jdkDynamicProxy;

public class Test {
	public static void main(String[] args) {
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		//�����������
		JdkDynamicProxy jdkProxy = new JdkDynamicProxy();
		//����Ŀ�����
		UserDao userDao =  new UserDaoImpl();
		//�Ӵ�������л�ȡ��ǿ���Ŀ�����
		UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
		//ִ�з���
		userDao1.addUser("����");
		userDao1.deleteUser();
	}
}
