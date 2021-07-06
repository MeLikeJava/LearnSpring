package com.spring.aop.jdkDynamicProxyBilibili;

public class Client {

	
	public static void main(String[] args) {
		IUsbSell targetObj = new UsbKingFactory();
		JdkDynamicProxy proxy = new JdkDynamicProxy();
		IUsbSell proxyObj = (IUsbSell)proxy.createProxy(targetObj);
		float price = proxyObj.sell(50);
		System.out.println("×Ü¼Û£º"+price);
	}

}
