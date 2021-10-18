package topic6_oops;

public class C6_Polymorphism_Overriding {

	public static void m1() {
		System.out.println("This is m1 from parent");
	}

	public void m2() {
		System.out.println("This is m2 from parent");
	}

	public static void main(String[] args) {

		C6_Polymorphism_Overriding obj = new ChildF();
		obj.m1();
		obj.m2();
	}

}

class ChildF extends C6_Polymorphism_Overriding {
	public static void m1() {
		System.out.println("This is m1 from child");
	}
}