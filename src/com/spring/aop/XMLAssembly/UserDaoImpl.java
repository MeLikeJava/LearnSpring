package com.spring.aop.XMLAssembly;

public class UserDaoImpl implements IUserDao {

	@Override
	public boolean addUser(String name) {
		System.out.println("�����û���" + name);
		return true;
	}

	@Override
	public String deleteUser(int id) {
		String returnV = "";
		if((id != -1)&&(id != 0)){
			System.out.println("�ɹ�ɾ��id:"+id+"���û�");
			returnV="success";
		}else{
			returnV="failed";
			System.out.println("����idֵ���Ϸ�:"+ id);
		}
		return returnV;
	}
	protected void say(){System.out.println("say()");};
	

}
