package com.spring.aop.jdkStaticProxy;

public class Client {
	public static void main(String[] args) {
		TaoBao taobao = new TaoBao();
		float price = taobao.sell(1);
		System.out.println("通过淘宝商家购买U盘单价："+price);
		WeiShang ws = new WeiShang();
		float price1 = ws.sell(1);
		System.out.println("通过微商商家购买U盘单价："+price1);
	}
}
