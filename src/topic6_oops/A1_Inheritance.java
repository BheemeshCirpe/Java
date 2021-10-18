package topic6_oops;

public class A1_Inheritance extends Object{

	int a = 10;

	public void m1() {

		System.out.println("This is m1 method from class A1_Inheritance");
	}

	public static void main(String[] args) {

		Child obj = new Child();

		obj.m2();
		System.out.println(obj.b);

		obj.m1();
		System.out.println(obj.a);

	}

}

class Child extends A1_Inheritance {

	int b = 20;

	public void m2() {
		System.out.println("This is m2 method from Child class");
	}
}