package com.spring.aop.jdkStaticProxy;


//TaoBao��һ���̼ң������ʿ��U�̵�����
public class TaoBao implements IUsbSell {
	//�����̼Ҵ���ĳ��Ҿ�����˭������Ŀ�����
	private UsbKingFactory factory = new UsbKingFactory();
	@Override
	public float sell(int number) {
		float price = factory.sell(number);//���Ҽ۸�
		price = price + 25.0f;//�ۼ�,������⣺�˴�Ϊ������ǿ���������������Ŀ�귽�����ú���ǿ�˹��ܡ�
		return price;//�����ۼ�
	}
}
