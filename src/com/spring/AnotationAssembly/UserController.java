package com.spring.AnotationAssembly;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController{
	@Resource(name = "userService")
	private UserService userService;
	public void save() {
		// TODO Auto-generated method stub
		this.userService.save();
		System.out.println("UserController±£´æ£¡");
	}

}
