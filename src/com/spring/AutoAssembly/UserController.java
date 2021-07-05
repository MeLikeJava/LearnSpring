package com.spring.AutoAssembly;

public class UserController{
	private UserService userService;
	public void save() {
		// TODO Auto-generated method stub
		this.userService.save();
		System.out.println("UserController±£´æ£¡");
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
