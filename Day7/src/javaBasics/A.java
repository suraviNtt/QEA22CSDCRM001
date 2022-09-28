package javaBasics;

public class A {
	public int i = 20;

	//overloading
	public void test() {
		System.out.println("in Test");
	}

	public void test(String s) {
		System.out.println("in Test "+s);
	}
	
	public void test(int s) {
		System.out.println("in Test "+s);
	}
	
	public void test(String s , int i , float f) {
		System.out.println("in Test "+s+" , "+i+" , "+f);
	}
	
	public static void main(String[] args) {

		System.out.println("Heelo Team");
		A a = new A();
		a.test();
		a.test(12);
		a.test("SDV");
		a.test("asas", 12, 12.3f);
		System.out.println(a.i);
	}
}
