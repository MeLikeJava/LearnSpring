package com.spring.aop.jdkStaticProxy;


//TaoBao是一个商家，代理金士顿U盘的销售
public class TaoBao implements IUsbSell {
	//声明商家代理的厂家具体是谁，声明目标对象
	private UsbKingFactory factory = new UsbKingFactory();
	@Override
	public float sell(int number) {
		float price = factory.sell(number);//厂家价格
		price = price + 25.0f;//售价,抽象理解：此处为功能增强，代理类在完成了目标方法调用后，增强了功能。
		return price;//返回售价
	}
}
