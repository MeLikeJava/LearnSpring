package com.spring.AnotationAssembly;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name = "userDao")
	private UserDao userDao;
	@Override
	public void save() {
		// TODO Auto-generated method stub
		this.userDao.save();
		System.out.println("UserService���棡");
	}

}
