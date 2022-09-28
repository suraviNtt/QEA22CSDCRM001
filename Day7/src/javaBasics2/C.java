package javaBasics2;

import javaBasics.A;

public class C extends A {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.i);
		
		A a = new A();
		System.out.println(a.i);
		
		A a1 = new C();
		System.out.println(a1.i);
	}
}
