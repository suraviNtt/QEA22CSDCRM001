package setExample;

import java.util.Set;
import java.util.TreeSet;

public class B {

	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<Integer>();
		s.add(123);
		s.add(1);
		s.add(100);
		s.add(12);
		s.add(16);
		
		System.out.println(s);

	}
}
