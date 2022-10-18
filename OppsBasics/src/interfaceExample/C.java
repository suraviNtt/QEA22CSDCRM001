package interfaceExample;
import abstractExample.A;

public class C extends A implements D ,B {

	@Override
	public void test() {
	System.out.println("D test");
		
	}

	@Override
	public void test1() {
		System.out.println("B Test");
		
	}
	
	public static void main(String[] args) {
		
		A a = new C();
		a.test();
		A.tes2();
		
	}

}
