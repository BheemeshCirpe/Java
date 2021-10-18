package topics10_strings;

public class A2_Strings {

	public static void main(String[] args) {

		String str1 = new String("Harish");  //immuatable
		StringBuffer str2 = new StringBuffer("Bheemesh");  //mutable
		StringBuilder str3 = new StringBuilder("Automation");  //mutable

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		String a=str1.concat(" ABC");
		
		str2.append(" XYZ");
		str3.append(" Testing");

		System.out.println("******************");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(a);
		System.out.println(str3);

	}

}
