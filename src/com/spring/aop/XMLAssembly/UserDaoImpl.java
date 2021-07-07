package com.spring.aop.XMLAssembly;

public class UserDaoImpl implements IUserDao {

	@Override
	public boolean addUser(String name) {
		System.out.println("新增用户：" + name);
		return true;
	}

	@Override
	public String deleteUser(int id) {
		String returnV = "";
		if((id != -1)&&(id != 0)){
			System.out.println("成功删除id:"+id+"的用户");
			returnV="success";
		}else{
			returnV="failed";
			System.out.println("传入id值不合法:"+ id);
		}
		return returnV;
	}
	protected void say(){System.out.println("say()");};
	

}
