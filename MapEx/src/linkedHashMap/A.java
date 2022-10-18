package linkedHashMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class A {

	public static void main(String[] args) {

		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(123, "Suravi");
		lhm.put(1, "abc");
		lhm.put(2, "xyz");
		lhm.put(23, "mno");
//		lhm.put(23, "Value");
		lhm.put(100, "mno");
		System.out.println(lhm);

		System.out.println(lhm.get(123));
		
		Set<Integer> s = lhm.keySet();
		System.out.println(s);
		
	 Collection<String> v =	lhm.values();
	 System.out.println(v);
	 
	 
	}
}
