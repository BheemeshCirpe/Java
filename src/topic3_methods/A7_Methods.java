package topic3_methods;

public class A7_Methods {

	public static void main(String[] args) {
		A7_Methods.test();
	}

	public static void test() {

	}

	public void m1() {
		A7_Methods.test();

	}

	public void m2() {
		A7_Methods obj = new A7_Methods();
		obj.m1();
	}

}
