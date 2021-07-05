package com.spring.aop.jdkStaticProxy;
//目标类：金士顿厂家,不接受用户单独购买
public class UsbKingFactory implements IUsbSell {

	@Override
	public float sell(int number) {
		//一个128G的U盘85元
		return 85.0f;
	}

}
