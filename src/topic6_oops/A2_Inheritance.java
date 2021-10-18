package topic6_oops;

public class A2_Inheritance {
	
	int a=10;
	public void m1() {
		System.out.println("This is m1 method from parent");
	}

	public static void main(String[] args) {
		GrandChild obj= new GrandChild();
		obj.m3();
		obj.m2();
		obj.m1();

		
	}
}

class Child1 extends A2_Inheritance{
	
	int b=20;
	
	public void m2() {
		System.out.println("This is m2 method from child");
	}
}

class GrandChild extends Child1{
	
	int c=30;
	public void m3() {	
		System.out.println("This is m3 method from Grand Child");
	}
}


