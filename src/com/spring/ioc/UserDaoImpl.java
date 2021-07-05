package com.spring.ioc;

public class UserDaoImpl implements UserDao {

	@Override
	public void say() {
		System.out.println("Hello Spring IOC!");
	}

}
