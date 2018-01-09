package radiate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCar {

	public static void main(String[] args) {
		//第一种 通过forName获得类名
		try {
			Class<?> c1 = Class.forName("radiate.Car");
			System.out.println(c1.getSimpleName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//第二种 通过对象获得类名
		Car c = new Car();
		Class<?> c2 = c.getClass();
		System.out.println(c2.getPackage());
		
		//第三种 通过类获得类名
		Class<?> c3 = Car.class;
		//System.out.println(c3.getName());
		//取得所有构造方法
		Constructor<?>[] cons = c3.getConstructors();
		for(Constructor<?> ct1:cons){
			//获取修饰符 方法名
			System.out.print(ct1.getModifiers() +" "+ct1.getName()+"(");
			Class<?>[] ct2 = ct1.getParameterTypes();
			for(int i = 0;i<ct2.length;i++){
				//获取参数
				System.out.print(ct2[i].getSimpleName()+" args"+i+",");
			}
			System.out.print(")"+"\n");
		}
		//获取所有属性
		Field[] fields = c3.getDeclaredFields();
		for(Field f:fields){
			System.out.println(f.getModifiers()+" "+f.getType().getSimpleName()+" "+f.getName());
		}
		//获取所有方法
		Method[] methods = c3.getDeclaredMethods();
		for(Method m:methods){
			System.out.println(m.getName());
		}
		//获取所有接口
		Class<?>[] inter = c3.getInterfaces();
		for(Class<?>cc:inter){
			System.out.println(cc.getSimpleName());
		}
	}

}
