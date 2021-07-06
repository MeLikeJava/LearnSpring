package com.spring.aop.jdkDynamicProxyBilibili;


public class Aspect {
	public float totalPrice(Object[] amount,float price){
		if(amount != null){
			price = (Integer)amount[0] * price;
		}
		return price;
	}
}
