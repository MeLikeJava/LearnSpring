package com.spring.aop.CGLIBDynamicProxy;
//Ŀ����
public class UserDao {
	public void addUser(String name){
		System.out.println("�����û�:"+name);
	}
	public void deleteUser(){
		System.out.println("ɾ���û�");
	}
}
