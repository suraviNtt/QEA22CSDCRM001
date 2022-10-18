package interfaceExample;

public class A implements B,D {

	static int i = 20;
	
	@Override
	public void test() {
		System.out.println(" A Test");
		
	}

	@Override
	public void test1() {
		System.out.println("A Test1");
		
	}
	
	
	public static void test3() {
		System.out.println("Test 3");
	}
	
	public static void main(String[] args) {
		
		System.out.println(A.i);
		A.test3();
		B.test2();
		System.out.println(B.i);
		
		D d = new C();
		d.test();
		
		D d1 = new A();
		d1.test();
	}

}
