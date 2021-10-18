package topic2_variables;

public class A7_Variables {

	static int a = 10;

	public static void main(String[] args) {

		System.out.println(A7_Variables.a);
		A7_Variables.a = 30;
		System.out.println(A7_Variables.a);

		m1();

	}

	public static void m1() {

		System.out.println("This is from m1 method " + A7_Variables.a);

	}

}
