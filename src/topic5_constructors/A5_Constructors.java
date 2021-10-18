package topic5_constructors;

public class A5_Constructors {
	int a = 30;

	public static void main(String[] args) {

		A5_Constructors obj= new A5_Constructors();
		obj.m1();

	}

	public  void m1() {
		int a = 10;
		System.out.println(a);
		System.out.println(this.a);
	}

}
