package com.spring.aop.jdkStaticProxy;
//WeiShang是一个商家，代理金士顿U盘的销售
public class WeiShang implements IUsbSell {
	//声明目标对象
	private UsbKingFactory king = new UsbKingFactory();
	@Override
	public float sell(int number) {
		float price = king.sell(number);//目标对象方法调用
		price = price + 1; //进行功能增强
		return price;
	}

}
