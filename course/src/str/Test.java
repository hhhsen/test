package str;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.setA("aaaa");
		a.setI(1111);
		b.setB(0.55);
		b.setI("bbbb");
		System.out.println(a.getA());
		List<A> lista = new ArrayList<>();
		List<B> listb = new ArrayList<>();
		List list = new ArrayList<>();
		lista.add(a);
		listb.add(b);
		for(int i = 0;i<lista.size();i++){
			System.out.println("lista("+i+")="+lista.get(i).getI());
		}
		for(int i = 0;i<listb.size();i++){
			System.out.println("listb("+i+")="+listb.get(i).getB());
		}
		list.add(lista);
		list.add(listb);
		for(int i = 0;i<list.size();i++){
			System.out.println("list("+i+")="+list.get(i));
		}
	}

}
