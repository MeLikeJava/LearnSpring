package com.spring.instance.instanceFactory;

public class CreateBeanFactory {
//	public CreateBeanFactory(){
//		System.out.println("实例工厂正在实例化中");
//	}
	public Bean createBean(){//创建Bean实例的工厂方法
		return new Bean();
	}
}
