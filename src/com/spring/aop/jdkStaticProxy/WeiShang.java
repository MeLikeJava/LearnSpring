package com.spring.aop.jdkStaticProxy;
//WeiShang��һ���̼ң������ʿ��U�̵�����
public class WeiShang implements IUsbSell {
	//����Ŀ�����
	private UsbKingFactory king = new UsbKingFactory();
	@Override
	public float sell(int number) {
		float price = king.sell(number);//Ŀ����󷽷�����
		price = price + 1; //���й�����ǿ
		return price;
	}

}
