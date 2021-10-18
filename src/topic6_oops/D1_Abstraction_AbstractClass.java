package topic6_oops;

public abstract class D1_Abstraction_AbstractClass {

	public void m1() {
		System.out.println("This is m1 method from abstract class");
	}

	abstract public void m2();
	abstract public void m3();

	public static void main(String[] args) {

		GrandChildG obj = new GrandChildG();
		obj.m3();
		obj.m2();
		obj.m1();

	}

}

abstract class ChildG extends D1_Abstraction_AbstractClass {

	@Override
	public void m2() {

	}

}

class GrandChildG extends ChildG {
	@Override
	public void m3() {
		// TODO Auto-generated method stub

	}
}
