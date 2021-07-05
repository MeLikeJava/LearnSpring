package com.spring.AnotationAssembly;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserDao±£´æ£¡");
	}

}
