package topic3_methods;

public class A3_Methods {

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		A3_Methods obj = new A3_Methods();
		double x = obj.m1(10, 2.2);

		System.out.println(x);

	}

	/**
	 * This method performs addition
	 * 
	 * @param a
	 * @param b
	 * @return
	 */

	public double m1(int a, double b) {

		double c = a + b;

		return c;
	}

}
