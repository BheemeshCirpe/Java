package topic6_oops;

public class B2_Polymorphism_Overloading {

	public B2_Polymorphism_Overloading() {

		System.out.println("This is 0 argument constuctor");
	}

	public B2_Polymorphism_Overloading(int a) {

		System.out.println("This is 1 argument constuctor");
	}

	public static void main(String[] args) {
		
		B2_Polymorphism_Overloading obj= new B2_Polymorphism_Overloading(10);

	}
}
