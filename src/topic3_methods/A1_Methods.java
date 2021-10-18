package topic3_methods;

public class A1_Methods {

	public static void main(String[] args) {
		System.out.println("This is main method");

		A1_Methods obj = new A1_Methods();
		obj.m1(); //Instance Method Calling using Object of that class
		A1_Methods.m2(); //Static method calling using Class name
		A1_Methods.m2();
		A1_Methods.m2();
		A1_Methods.m2();
	}

	public void m1() { //Method Declaration
		
		System.out.println("This is Instance method"); //Method Implementation	
		
	}

	public static void m2() {
		System.out.println("This is static method");
	}

}
