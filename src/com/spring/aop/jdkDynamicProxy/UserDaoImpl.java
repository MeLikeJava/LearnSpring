package com.spring.aop.jdkDynamicProxy;

public class UserDaoImpl implements UserDao{
	@Override
	public void addUser(String name) {
		// TODO Auto-generated method stub
		System.out.println("����û�"+"----������"+name);
	}
	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("ɾ���û�");
	}
}
