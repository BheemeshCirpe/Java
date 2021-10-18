package topic8_exceptionhandling;

public class A6_ExceptionHandling {

	public static void main(String[] args) throws MyException {

		System.out.println("First");
		A6_ExceptionHandling.age(10);

		System.out.println("Last");

	}

	public static void age(int a) throws MyException {

		if (a > 18) {

			System.out.println("Eligible for Vote");
		} else {
			throw new MyException();
		}

	}

}

class MyException extends Exception {

	MyException() {
		System.out.println("This is my execption");
	}
}
