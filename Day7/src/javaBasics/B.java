package javaBasics;

public class B extends A {

	int a = 100;
	char c = 'x';
	
	public void test() {
		int i = 90;
		System.out.println("Inside Test");
		System.out.println(i);
		System.out.println(a);
	}
	
	//B b = new B();
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.c);
		b.test();
		A a = new A();
		System.out.println(a.i);
		a.test();
		//overriding
		A a1 = new B();
		a1.test();
	}
}
