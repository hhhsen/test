package radiate;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class TestCar1 {

	public static void main(String[] args) {
		Car car = new Car();
		Class<?>clz = car.getClass();
		try {
			/*//调用set,get方法赋值输出
			Method setC = clz.getMethod("setColor", String.class);
			setC.invoke(car, "白色");
			Method setN = clz.getMethod("setName", String.class);
			setN.invoke(car, "QQ");
			Method getC = clz.getMethod("getColor");
			Method getN = clz.getMethod("getName");
			System.out.println(getC.invoke(car)+" "+getN.invoke(car));
			*/
			//通过获取构造方法赋值
			Constructor<?> c = clz.getConstructor(String.class,String.class);
			car = (Car) c.newInstance("白色","QQ");
			System.out.println(car);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		Class<Car> cla = Car.class;
		System.out.println("类加载器："+cla.getClassLoader());
	}

}
