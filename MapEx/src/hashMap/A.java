package hashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(123, "Suravi");
		hm.put(1, "abc");
		hm.put(2, "xyz");
		hm.put(23, "mno");
//		hm.put(23, "Value");
		hm.put(100, "mno");
		System.out.println(hm);

		System.out.println(hm.get(123));
		
		Set<Integer> s = hm.keySet();
		System.out.println(s);
		
	 Collection<String> v =	hm.values();
	 System.out.println(v);
	 
	}

}
