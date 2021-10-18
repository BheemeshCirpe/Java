package topic7_accessmodifies;

public class A1_AccessModifiers {
	
		private static int a=10; //private variable
		static int b=10; 
		protected static int c = 10;
		public  static int d=10; //public variable
	

	public static void main(String[] args) {
	
		System.out.println(A1_AccessModifiers.a);
		System.out.println(A1_AccessModifiers.b);
		System.out.println(A1_AccessModifiers.c);
		System.out.println(A1_AccessModifiers.d);
	}

}

class ChildY extends A1_AccessModifiers {

	public void m1() {

		System.out.println(A1_AccessModifiers.a);
		System.out.println(A1_AccessModifiers.b);
		System.out.println(A1_AccessModifiers.c);
		System.out.println(A1_AccessModifiers.d);
	}
}