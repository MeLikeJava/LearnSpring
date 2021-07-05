package com.spring.instance.static_factory;

public class CreateBeanFactory {
	public static Bean createBean(){
		//此方法称静态工厂类，主要作用是实例化Bean对象
		return new Bean();
	}
}
