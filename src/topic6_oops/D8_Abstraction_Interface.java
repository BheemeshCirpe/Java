package topic6_oops;

public interface D8_Abstraction_Interface {

	public static final int a = 5;
	
	int b = 5;

	default void m1() {

	}

	public static void main(String[] args) {

		ChildY obj = new ChildY();
		System.out.println(obj.a);
	}

}

class ChildY implements D8_Abstraction_Interface {

	public static void main(String[] args) {

		ChildY obj = new ChildY();
		System.out.println(obj.a);
	}

}
