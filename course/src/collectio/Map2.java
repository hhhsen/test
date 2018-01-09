package collectio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		Map<Emp,String> map = new HashMap<>();
		Emp emp[] = {new Emp(0),new Emp(1),new Emp(2),new Emp(3)};
		for(int i = 0; i<emp.length;i++){
			map.put(emp[i], emp[i].toString());
		}
		map.put(new Emp(0), "aa");	//新new一个key，使两个key相同value却不覆盖
		map.remove(emp[1]); 		//把key为1的删除
		System.out.println("是否存在key："+map.containsKey(emp[0]));
		System.out.println("是否存在value:"+map.containsValue(emp[0].toString()));
		Set<Emp> keySet = map.keySet();
		for(Emp key : keySet){
			             //输出key和value,可单获取key,value
			System.out.println(key+"==>"+map.get(key));
		}
	}

}
