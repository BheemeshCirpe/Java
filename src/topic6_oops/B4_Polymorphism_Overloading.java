package topic6_oops;

public class B4_Polymorphism_Overloading {
	
	public void add(int a, int b) {

		System.out.println(a + b);
	}

	/*
	 * public int add(int a,int b) {
	 * 
	 * System.out.println(a );
	 * 
	 * return a }
	 */
	public static void main(String[] args) {

		B4_Polymorphism_Overloading obj = new B4_Polymorphism_Overloading();

		obj.add(10, 20);

	}

}
