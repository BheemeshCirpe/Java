package topic6_oops;

public class C1_Polymorphism_Overriding{
	public void m1() {
		System.out.println("This is m1 from parent");
	}

	public void m3() {
		System.out.println("This is m3 from parent");
	}

	public static void main(String[] args) {
		ChildA1 obj = new ChildA1();
		obj.m2();
		obj.m1(10);

	}

}

class ChildA1 extends C1_Polymorphism_Overriding {

	public void m1(int a) {
		System.out.println("This is m1 from child with some enhancements");
	}

	public void m2() {

		System.out.println("This is m2 from child");
	}
}
