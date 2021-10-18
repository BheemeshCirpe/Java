package topic8_exceptionhandling;

public class A5_ExceptionHandling {

	public static void main(String[] args) throws InterruptedException  {

		System.out.println("This is first statement");
		A5_ExceptionHandling.m1();
		
		Thread.sleep(3000);

		System.out.println("This is last statement");

	}

	public static void m1()  {
		System.out.println("This is m1 method first statement");

		try {
			A5_ExceptionHandling.m2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("This is m1 method last statement");

	}

	public static void m2() throws InterruptedException {
		System.out.println("This is m1 method first statement");

		Thread.sleep(5000);
		
//		int a=10/0;

		System.out.println("This is m1 method last statement");

	}

}
