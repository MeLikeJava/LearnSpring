
***���ڴ�����ProxyFactoryBeanʵ��AOP***
	
		1��ProxyFactoryBean��FactoryBean�ӿڵ�ʵ����
			���ͣ�
				1)FactoryBean����ʵ����Bean
				2)ProxyFactoryBean����Ϊ����Bean��������ʵ��
			��Ҫ����ע��Ĳ�����
				1)target:�����Ŀ�����,��ֵ��һ��ʵ������
				2)proxyInterfaces:������Ҫʵ�ֵĽӿ�,����ӿ�ʹ��<list> <value></value>.... </list>��ֵ
				3)proxyTargetClass:ֵΪboolean����,����Ϊ�Ƿ�����������ǽӿ�,trueΪCGLIB����false(Ĭ��)ΪJDK��̬����
				4)interceptorNames:��Ҫ֯���֪ͨbean
				5)singleton:���ش����Ƿ�Ϊ����,Ĭ��Ϊtrue(�����ص�ʵ��)
				6)optimize:ֵΪboolean����,������trueǿ��ʹ��CGLIB����ʽ	
			XML���ò��裺1)����Ŀ����bean 
						2)����������bean
						3)��������Ŀ����beanʵ��,��class="org.springframework.aop.framework.ProxyFactoryBean",��������������ע���������Ӧ���ԡ�