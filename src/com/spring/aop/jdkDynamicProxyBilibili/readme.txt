
此包中演示的是哔哩哔哩JDK动态代理教学中的代码，视频地址：https://www.bilibili.com/video/BV1ti4y177xu?p=9&spm_id_from=pageDriver

动态代理:在静态代理中目标类很多的时候，可以使用动态代理，它能避免静态代理中的缺点。

优点：	
		1、动态代理中目标类即使很多，代理类数量可以很少。
		2、当修改了接口中的方法时，不会影响代理类。

动态代理的概念：在程序执行过程中，使用JDK的反射机制，来创建代理类对象，并动态的指定要代理的目标类。
			换句话说：动态代理就是一种创建java对象的能力，让你不用手工创建代理类文件，还能创建出代理类的实例对象。
			
注意：JDK动态代理要求目标对象必须实现接口，这是java设计上的要求。

****反射*****：1、java.lang.reflect.Method类,表示类中的方法，通过Method可以执行某个方法。

****JDK动态代理的实现****：主要利用java.lang.reflect包中的：1、InvocationHandler(接口) 2、Method(类) 3、Proxy(类) 
				
	InvoationHandler(接口):该接口中仅包含invoke()一个方法，InvocationHandler接口中文名叫做调用处理器，负责完成调用目标方法，并增强功能。换言之就是增强的功能需要写在invoke该方法中。
						     通过代理对象执行目标接口中的方法，会把方法的调用分派给调用处理器的实现类，执行实现类中的invoke()方法。
		
		invoke()方法原型:public Object invoke(Object proxy, Method method, Object[] args)
				       参数：Object proxy:JDK创建的代理对象，JDK提供无需赋值
				       	 Method method:目标类中的方法,JDK提供无需赋值
				       	 Object[] args：目标类中方法的参数,JDK提供无需赋值
	
	代理类需要完成的功能：
		1、需要调用目标方法，执行目标方法中的功能。
		2、功能增强，在目标方法调用时，增加额外的功能。
		
	2、Method(类):代表目标类中方法，作用：通过method可以执行某个目标类中的方法