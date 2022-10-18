package treeMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A {

	public static void main(String[] args) {

		Map<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(123, "Suravi");
		tm.put(1, "abc");
		tm.put(2, "xyz");
		tm.put(23, "mno");
//		tm.put(23, "Value");
		tm.put(100, "mno");
		System.out.println(tm);

		System.out.println(tm.get(123));

		Set<Integer> s = tm.keySet();
		System.out.println(s);

		Collection<String> v = tm.values();
		System.out.println(v);
	

	}
}
