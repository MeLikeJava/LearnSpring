
***基于代理类ProxyFactoryBean实现AOP***
	
		1、ProxyFactoryBean是FactoryBean接口的实现类
			解释：
				1)FactoryBean负责实例化Bean
				2)ProxyFactoryBean负责为其他Bean创建代理实例
			需要依赖注入的参数：
				1)target:代理的目标对象,其值是一个实例对象
				2)proxyInterfaces:代理需要实现的接口,多个接口使用<list> <value></value>.... </list>赋值
				3)proxyTargetClass:值为boolean类型,含义为是否对类代理而不是接口,true为CGLIB代理，false(默认)为JDK动态代理
				4)interceptorNames:需要织入的通知bean
				5)singleton:返回代理是否为单例,默认为true(即返回单实例)
				6)optimize:值为boolean类型,当设置true强制使用CGLIB代理方式	
			XML配置步骤：1)声明目标类bean 
						2)声明切面类bean
						3)声明代理目标类bean实例,其class="org.springframework.aop.framework.ProxyFactoryBean",配置其所需依赖注入的上述相应属性。