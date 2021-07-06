package com.spring.aop.CGLIBDynamicProxy;
//目标类
public class UserDao {
	public void addUser(String name){
		System.out.println("增加用户:"+name);
	}
	public void deleteUser(){
		System.out.println("删除用户");
	}
}
