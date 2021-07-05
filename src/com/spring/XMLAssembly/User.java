package com.spring.XMLAssembly;

import java.util.List;

public class User {
	private String userName;
	private Integer password;
	private List<String> list;
	public User(String username,Integer password,List<String> list){
		super();
		this.userName = username;
		this.password = password;
		this.list = list;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", list=" + list + "]";
	}
}
