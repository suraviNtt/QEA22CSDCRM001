package setExample;

import java.util.HashSet;

public class A {

	public static void main(String[] args) {

		HashSet<Integer> abc = new HashSet<Integer>();
		abc.add(123);
		abc.add(1);
		abc.add(100);
		abc.add(12);
		abc.add(16);

		for (Integer i : abc) {
			System.out.println(i);
		}
		
		abc.remove(123);
		
		System.out.println(abc);
	}
}
