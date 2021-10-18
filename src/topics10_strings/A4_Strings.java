package topics10_strings;

public class A4_Strings {

	public String toString() {
		return "This is my string";
	}

	public void m1() {

		System.out.println("This m1 method");
	}

	public static void main(String[] args) {
		A4_Strings obj = new A4_Strings();
		System.out.println(obj.toString());
		
		obj.m1();

	}

}
