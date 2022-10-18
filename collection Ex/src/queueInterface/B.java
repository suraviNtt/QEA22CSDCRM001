package queueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class B {

	public static void main(String[] args) {
		
		Queue< String> pq = new PriorityQueue<String>();
		pq.add("123");
		pq.add("abc");
		pq.add("xyz");
		
		for (Object object : pq) {
			System.out.println(object);
		}
	}
}
