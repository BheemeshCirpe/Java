package topics10_strings;

public class A5_Strings {

	public static void main(String[] args) {

		String str1 = new String("Bheemesh");
		String str2 = new String("Bheemesh");

		System.out.println(str1.equals(str2));

		StringBuffer s1 = new StringBuffer("Harisha");
		StringBuffer s2 = new StringBuffer("Harisha");

		System.out.println(s1.equals(s2));

		StringBuilder h1 = new StringBuilder("Harisha");
		StringBuilder h2 = new StringBuilder("Harisha");

		System.out.println(h1.equals(h2));
	}

}
