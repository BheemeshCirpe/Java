package topic6_oops;

public class C5_Polymorphism_Overriding {

	public void m1() {

		System.out.println("This is m1 from parent");
	}

	public void m2() {

		System.out.println("This is m2 from parent");
	}
	
	public void m4() {

		System.out.println("This is m4 from parent");
	}

	public static void main(String[] args) {

		C5_Polymorphism_Overriding obj = new ChildE();
		
		obj.m1();
		obj.m2();
	//	obj.m3();
		obj.m4();
	
		

		
		
	}

}

class ChildE extends C5_Polymorphism_Overriding {

	public void m1() {
		System.out.println("This is m1 from child");
	}

	public void m3() {

		System.out.println("This is m3 from child");
	}
	
	public void m4() {
		System.out.println("This is m4 from child");
	}


}
