package topic5_constructors;

public class A1_Constructors {

	int x;

	public A1_Constructors() {
		System.out.println("This is Constructor with 0 Arguments");
	}

	public A1_Constructors(int a) {
		System.out.println("This is Constructor with 1 Argument");
		x = a;
	}

	public A1_Constructors(int a, int b) {
		System.out.println("This is Constructor with 2 Arguments");
		x = b;
	}

	public A1_Constructors(int a, double b) {
		System.out.println("This is Constructor with 2 Arguments with double value");
		x = a;
	}

	public static void main(String[] args) {

		A1_Constructors obj = new A1_Constructors(10, 20);
		obj.m1();
		
		A1_Constructors obj1 = new A1_Constructors(30, 20.2);
		obj1.m1();

	}

	void m1() {

		System.out.println("This is m1 instance method");
		System.out.println(x);

	}

}
