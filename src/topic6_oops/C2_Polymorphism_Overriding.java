package topic6_oops;

public class C2_Polymorphism_Overriding {

	public void m1() {

		System.out.println("This is m1 from parent");
	}

	public static void main(String[] args) {

	}

}

class childB extends C2_Polymorphism_Overriding {

	public void m1() {

		System.out.println("This is m1 from child");
	}

}