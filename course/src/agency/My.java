package agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class My implements InvocationHandler {
	//实现动态代理机制要InvocationHandler接口和Proxy类的支持
	private Object proxy;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		System.out.println("=======开始========");
		Object result = method.invoke(this.proxy,args);
		System.out.println("=======结束========");
		return result;
	}
	public Object createProxy(Object proxy){
		this.proxy = proxy;
		Class<?> c = this.proxy.getClass();
		//ClassLoader loader：		类加载器,
		//Class<?>[] interfaces：	得到全部的接口,
		//InvocationHandler h：		得到InvocationHandler接口的子类实例
		return Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), this);
	}

}
