package collectio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sett {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Set set = new HashSet<>();
		list.add("A");
		list.add("a");
		list.add("c");
		list.add("C");
		list.add("a");
		System.out.print(list);
		set.addAll(list);
		System.out.print("\n"+set);
	}

}
