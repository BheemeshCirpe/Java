package topic8_exceptionhandling;

public class A4_ExceptionHandling {

	public static void main(String[] args) {

		final int b=1;
		System.out.println("First");
		try {
			int a = 80 /b;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
		} finally {
			System.out.println("Finally");
		}

		System.out.println("Last");
	}

}
