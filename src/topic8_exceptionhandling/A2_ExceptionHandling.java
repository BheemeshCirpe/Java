package topic8_exceptionhandling;

public class A2_ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("This is first statement");
		int b = 0;
		String str=null;

		try {
			int a = 80 / b;
//			str.length();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}

		System.out.println("This is last statement");

	}

}
