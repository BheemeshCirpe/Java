package topic6_oops;

public class A6_Inheritance {
	public A6_Inheritance() {

		System.out.println("This is Parent Class constructor");

	}

	public static void main(String[] args) {

		Testt2 obj = new Testt2();

	}

}

class Testt extends A6_Inheritance {

	public Testt() {
		System.out.println("This is child class constructor");
	}

}

class Testt2 extends Testt{
	
	public Testt2() {
		
		System.out.println("This is grandchid class constructor");
	}

}
