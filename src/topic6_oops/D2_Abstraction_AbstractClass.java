package topic6_oops;

public abstract class D2_Abstraction_AbstractClass {

	public D2_Abstraction_AbstractClass() {
		System.out.println("This is 0 argument constructor of Abstract class");
	}

	public static void main(String[] args) {
		ChildH obj = new ChildH();

	}

}

class ChildH extends D2_Abstraction_AbstractClass {

}
