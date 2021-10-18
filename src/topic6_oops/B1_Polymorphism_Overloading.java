package topic6_oops;

public class B1_Polymorphism_Overloading {

	public void add() {
		System.out.println("This is m1 method 0 arguments " + 10);
	}

	public static void add(char c) {
		System.out.println("This is m1 method 0 arguments " + 10);
	}

	public void add(int a) {
		int c = +10 + a;
		System.out.println("This is m1 method 1 arguments " + c);
	}

	public void add(int a, int b) {
		int c = +10 + a + b;
		System.out.println("This is m1 method 2 arguments accepting interger " + c);
	}

	public void add(double a, double b) {
		double c = +10 + a + b;
		System.out.println("This is m1 method 2 arguments accepting double " + c);
	}

	public void add(float a, double b) {
		double c = +10 + a + b;
		System.out.println("This is m1 method 2 arguments accepting double " + c);
	}

	public static void main(String[] args) {

		B1_Polymorphism_Overloading obj = new B1_Polymorphism_Overloading();
		obj.add(10.1f, 20.2);

	}

}
