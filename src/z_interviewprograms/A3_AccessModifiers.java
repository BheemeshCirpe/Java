package z_interviewprograms;

import topic7_accessmodifies.A1_AccessModifiers;

public class A3_AccessModifiers {

	public static void main(String[] args) {

		System.out.println(A1_AccessModifiers.a);
		System.out.println(A1_AccessModifiers.b);
		System.out.println(A1_AccessModifiers.c);
		System.out.println(A1_AccessModifiers.d);

	}

}

class ChildZ extends A1_AccessModifiers {

	public void m1() {

		System.out.println(A1_AccessModifiers.a);
		System.out.println(A1_AccessModifiers.b);
		System.out.println(A1_AccessModifiers.c);
		System.out.println(A1_AccessModifiers.d);
	}
}
