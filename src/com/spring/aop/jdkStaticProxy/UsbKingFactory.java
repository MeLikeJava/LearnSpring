package com.spring.aop.jdkStaticProxy;
//Ŀ���ࣺ��ʿ�ٳ���,�������û���������
public class UsbKingFactory implements IUsbSell {

	@Override
	public float sell(int number) {
		//һ��128G��U��85Ԫ
		return 85.0f;
	}

}
