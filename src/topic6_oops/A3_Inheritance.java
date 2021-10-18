package topic6_oops;

public class A3_Inheritance {
	
	public void m3() {
		System.out.println("This is m3 from Parent Class");
	}

	public static void main(String[] args) {
		
	}

}

class Chilld1 extends A3_Inheritance{
	
	public void m1() {
		System.out.println("This is m1 method from Chilld1");
	}
}

class Chilld2 extends A3_Inheritance{
	
	public void m1() {
		System.out.println("This is m1 method from Chilld2");
	}
}
