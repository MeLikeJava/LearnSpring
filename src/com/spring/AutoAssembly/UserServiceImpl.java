package com.spring.AutoAssembly;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	@Override
	public void save() {
		// TODO Auto-generated method stub
		this.userDao.save();
		System.out.println("UserService���棡");
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
