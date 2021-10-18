package topics10_strings;

public class A3_Strings {

	public void m1() {

		System.out.println("This is m1 method");
	}

	public static void main(String[] args) {

		A3_Strings obj = new A3_Strings();
		System.out.println(obj);
		System.out.println(obj.toString());

		String str = new String("Bheem");

		System.out.println(str);
		System.out.println(str.toString());
		

		StringBuffer str1 = new StringBuffer("Harisha");
		System.out.println(str1);
		System.out.println(str1.toString());
		
		
		StringBuilder str2 = new StringBuilder("Sai");
		System.out.println(str2);
		System.out.println(str2.toString());



	}

}
