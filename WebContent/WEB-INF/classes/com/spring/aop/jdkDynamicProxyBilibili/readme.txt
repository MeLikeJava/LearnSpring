
ʲô�Ƕ�̬����
���ڳ���ִ�й����У�ʹ��JDK�ķ�����ƣ���������������󣬲���̬��ָ��Ҫ�����Ŀ���ࡣ
	���仰˵����̬�������һ�ִ���java��������������㲻���ֹ������������ļ������ܴ������������ʵ������

�˰�����ʾ������������JDK��̬�����ѧ�еĴ��룬��Ƶ��ַ��https://www.bilibili.com/video/BV1ti4y177xu?p=9&spm_id_from=pageDriver

��̬����:�ھ�̬������Ŀ����ܶ��ʱ�򣬿���ʹ�ö�̬�������ܱ��⾲̬�����е�ȱ�㡣

�ŵ㣺	
		1����̬������Ŀ���༴ʹ�ܶ࣬�������������Ժ��١�
		2�����޸��˽ӿ��еķ���ʱ������Ӱ������ࡣ

ע�⣺JDK��̬����Ҫ��Ŀ��������ʵ�ֽӿڣ�����java����ϵ�Ҫ��

****����*****��1��java.lang.reflect.Method��,��ʾ���еķ�����ͨ��Method����ִ��ĳ��������

****JDK��̬�����ʵ��****����Ҫ����java.lang.reflect���еģ�1��InvocationHandler(�ӿ�) 2��Method(��) 3��Proxy(��) 
				
	1��InvoationHandler(�ӿ�):�ýӿ��н�����invoke()һ��������InvocationHandler�ӿ��������������ô�������������ɵ���Ŀ�귽��������ǿ���ܡ�����֮������ǿ�Ĺ�����Ҫд��invoke�÷����С�
						     ͨ���������ִ��Ŀ��ӿ��еķ�������ѷ����ĵ��÷��ɸ����ô�������ʵ���ִ࣬��ʵ�����е�invoke()������
		
		invoke()����ԭ��:public Object invoke(Object proxy, Method method, Object[] args)
				       ������Object proxy:JDK�����Ĵ������JDK�ṩ���踳ֵ
				       	 Method method:Ŀ�����еķ���,JDK�ṩ���踳ֵ
				       	 Object[] args��Ŀ�����з����Ĳ���,JDK�ṩ���踳ֵ
	
	��������Ҫ��ɵĹ��ܣ�
		
		1����Ҫ����Ŀ�귽����ִ��Ŀ�귽���еĹ��ܡ�
		2��������ǿ����Ŀ�귽������ʱ�����Ӷ���Ĺ��ܡ�
		
	2��Method(��):���������з�������ֻҪ����java����������ķ��������Խ�������Method�ࡣ
					
					���ã�Method�������ͨ��invoke()ִ��ĳ��Ŀ�����еķ���
					
					invoke()����ԭ�ͣ�public Object invoke(Object obj, Object... args)
						������ 1��Object obj��Ҫִ�е�Ŀ�����
							  2��Object... args��ִ�з�������Ҫ�Ĳ���
					
					ע�⣺�����invoke()��InvocationHandler�ӿ���invoke()ֻ������������ͬ���ѡ�
					
					�﷨��Object value = (Object)method.invoke(Ŀ�����,��������) 	
					
					ʾ����String returnV = (String) ask.invoke(target,"������ӷ���ֵ",18);
					
					˵����ask.invoke(target,"newʵ����",20) === s.ask("newʵ����", 20);
	
	3��Proxy(��):�����������֮ǰ����������new constructor(),��������ʹ��Proxy�ķ���������new��ʹ�á�
		
		��������̬����newProxyInstance(),���ã�����������󣬵�ͬ��Object obj = new ClassConstructor();
		
		newProxyInstance����ԭ�ͣ�public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
			
			������1��ClassLoader loader:�������,�������ڴ��м��ض���ʹ�÷����ȡĿ������ClassLoader
				 2��Class<?>[] interface:�ӿ�,Ŀ�����ʵ�ֵĽӿ�,Ҳ�Ƿ����ȡ�ġ�
				 3��InvocationHandler h���Լ���д�Ĵ�����Ҫ��ɵĹ��ܡ�
				 4������ֵObject�������������������ӹ������ķ���ֵ������Ŀ�����Ĵ������
				 
ʵ�ֶ�̬����Ĳ��裺1�������ӿڣ�����Ŀ����Ҫ��ɵĹ��ܡ�
		          2������Ŀ����ʵ�ֽӿڡ�
		          3������InvocationHandler�ӿڵ�ʵ���࣬��invoke()����ɴ�����Ĺ��ܡ�
		          	3.1������Ŀ�귽����
		          	3.2����ǿ����
		          4��ʹ��Proxy��ľ�̬����������������󡣲��ѷ���ֵǿתΪ�ӿ����͡�