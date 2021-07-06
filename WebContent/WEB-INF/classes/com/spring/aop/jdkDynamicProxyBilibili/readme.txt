
什么是动态代理？
答：在程序执行过程中，使用JDK的反射机制，来创建代理类对象，并动态的指定要代理的目标类。
	换句话说：动态代理就是一种创建java对象的能力，让你不用手工创建代理类文件，还能创建出代理类的实例对象。

此包中演示的是哔哩哔哩JDK动态代理教学中的代码，视频地址：https://www.bilibili.com/video/BV1ti4y177xu?p=9&spm_id_from=pageDriver

动态代理:在静态代理中目标类很多的时候，可以使用动态代理，它能避免静态代理中的缺点。

优点：	
		1、动态代理中目标类即使很多，代理类数量可以很少。
		2、当修改了接口中的方法时，不会影响代理类。

注意：JDK动态代理要求目标对象必须实现接口，这是java设计上的要求。

****反射*****：1、java.lang.reflect.Method类,表示类中的方法，通过Method可以执行某个方法。

****JDK动态代理的实现****：主要利用java.lang.reflect包中的：1、InvocationHandler(接口) 2、Method(类) 3、Proxy(类) 
				
	1、InvoationHandler(接口):该接口中仅包含invoke()一个方法，InvocationHandler接口中文名叫做调用处理器，负责完成调用目标方法，并增强功能。换言之就是增强的功能需要写在invoke该方法中。
						     通过代理对象执行目标接口中的方法，会把方法的调用分派给调用处理器的实现类，执行实现类中的invoke()方法。
		
		invoke()方法原型:public Object invoke(Object proxy, Method method, Object[] args)
				       参数：Object proxy:JDK创建的代理对象，JDK提供无需赋值
				       	 Method method:目标类中的方法,JDK提供无需赋值
				       	 Object[] args：目标类中方法的参数,JDK提供无需赋值
	
	代理类需要完成的功能：
		
		1、需要调用目标方法，执行目标方法中的功能。
		2、功能增强，在目标方法调用时，增加额外的功能。
		
	2、Method(类):它代表所有方法，将只要是用java语言所定义的方法都可以将其抽象成Method类。
					
					作用：Method对象可以通过invoke()执行某个目标类中的方法
					
					invoke()方法原型：public Object invoke(Object obj, Object... args)
						参数： 1、Object obj：要执行的目标对象
							  2、Object... args：执行方法所需要的参数
					
					注意：这里的invoke()和InvocationHandler接口中invoke()只是碰巧名字相同而已。
					
					语法：Object value = (Object)method.invoke(目标对象,方法参数) 	
					
					示例：String returnV = (String) ask.invoke(target,"多参数加返回值",18);
					
					说明：ask.invoke(target,"new实例化",20) === s.ask("new实例化", 20);
	
	3、Proxy(类):创建代理对象。之前创建对象都是new constructor(),现在我们使用Proxy的方法来代替new的使用。
		
		方法：静态方法newProxyInstance(),作用：创建代理对象，等同于Object obj = new ClassConstructor();
		
		newProxyInstance方法原型：public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
			
			参数：1、ClassLoader loader:类加载器,负责向内存中加载对象。使用反射获取目标对象的ClassLoader
				 2、Class<?>[] interface:接口,目标对象实现的接口,也是反射获取的。
				 3、InvocationHandler h：自己编写的代理类要完成的功能。
				 4、返回值Object：根据上述三个参数加工出来的返回值，就是目标对象的代理对象。
				 
实现动态代理的步骤：1、创建接口，定义目标类要完成的功能。
		          2、创建目标类实现接口。
		          3、创建InvocationHandler接口的实现类，在invoke()中完成代理类的功能。
		          	3.1、调用目标方法。
		          	3.2、增强功能
		          4、使用Proxy类的静态方法，创建代理对象。并把返回值强转为接口类型。