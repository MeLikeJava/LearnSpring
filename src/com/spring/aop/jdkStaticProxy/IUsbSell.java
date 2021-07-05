package com.spring.aop.jdkStaticProxy;

//表示功能,厂家、商家都需要完后的功能。
public interface IUsbSell {
	/**
	 * @param number 表示一次购买的数量
	 * @param float 返回值表示单个U盘的价格 
	 * */
	public float sell(int number);
	//可以定义多个其他的方法
}
