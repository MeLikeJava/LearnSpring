package com.spring.aop.jdkStaticProxy;

public class Client {
	public static void main(String[] args) {
		TaoBao taobao = new TaoBao();
		float price = taobao.sell(1);
		System.out.println("ͨ���Ա��̼ҹ���U�̵��ۣ�"+price);
		WeiShang ws = new WeiShang();
		float price1 = ws.sell(1);
		System.out.println("ͨ��΢���̼ҹ���U�̵��ۣ�"+price1);
	}
}
