package topic6_oops;

public interface D3_Abstraction_Interface {

	int a = 5;

	public abstract void m1();
	public abstract void m2();
	

}

class ChildJ implements D3_Abstraction_Interface {

	@Override
	public void m1() {

		System.out.println("This is m1 method");

	}

	@Override
	public void m2() {

		System.out.println("This is m2 method");
	}

}