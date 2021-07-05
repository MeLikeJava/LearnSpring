package com.spring.ioc;


public class UserServiceImpl implements UserService{

	private UserDao userDao;//Í¨¹ýspringÒÀÀµ×¢ÈëuserDao
	private String username;
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}
	public void say() {
		userDao.say();
		System.out.println("UserService say Hello Spring!"+"\nwho say?"+username);
	}
	public UserServiceImpl(String username){
		this.username = username;
	}
}
