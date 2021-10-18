package topic8_exceptionhandling;

public class A3_ExceptionHandling {

	public static void main(String[] args) {

		int b = 1;
		String str = null;

		try {
			int a = 80 / b;
			System.out.println("Testing");
			str.length();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
		}

		catch (NullPointerException e) {
			System.out.println("Null pointer Exception handled");
		}

		System.out.println("This is last statement");
	}

}
