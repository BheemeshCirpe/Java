package topic3_methods;

public class A2_Methods {

	public static void main(String[] args) {

		System.out.println("This is main method");
		
		int x=A2_Methods.add(10,20);
		
		System.out.println(x);
		
		int y=A2_Methods.add(100, 30);
		System.out.println(y);
		
		int z=A2_Methods.add(8, 1);
		System.out.println(z);

	}

	public static int add(int a, int b) {

		System.out.println("This is add method");
		int c = a + b;
		return c;

	}

}
