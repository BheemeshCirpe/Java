package topics10_strings;

public class A6_Strings {

	public static void main(String[] args) {

		String str = new String("Automation Testing");
		String str1 = new String("automation testing");
		String str2 = new String("   Bheemesh Cirpe   ");

		// == operator always compares address locations of strings
		// equlas() method --> Object class compares address locations of strings,
		// -->String Class equals() content of the String compare

		System.out.println(str == str1);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str2));

		System.out.println(str.startsWith("Automation"));
		System.out.println(str.startsWith("ting"));

		System.out.println(str.endsWith("ng"));
		System.out.println(str.endsWith("ag"));

		System.out.println(str.concat(" Selenium"));

		System.out.println(str.charAt(1));

		System.out.println(str.indexOf('A'));

		System.out.println(str.contains("sting"));

		System.out.println(str2);

		System.out.println(str2.trim());

		System.out.println(str.replace('o', 'z'));

		System.out.println("*********************************");

		String s = "Bheemesh,Sai-Harisha,Archana";

		System.out.println(s);

		String a[] = s.split("-");

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

		System.out.println(str.length());

		String s1 = "Nani";

		System.out.println(s1.length());
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));

		}

		int a1[] = { 1, 4, 2, 3 };
		System.out.println(a1.length);

		for (int i = 0; i < a1.length; i++) {

			System.out.println(a1[i]);
		}

		String b = "";

		System.out.println(b.isEmpty());

	}

}
