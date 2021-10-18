package topic5_constructors;

public class A2_Constructors {

	int a;

	public A2_Constructors(int x) {

		System.out.println("Business logics");
		a = x;

	}

	public static void main(String[] args) {
		A2_Constructors obj = new A2_Constructors(10);
		System.out.println(obj.a);
	}

}
