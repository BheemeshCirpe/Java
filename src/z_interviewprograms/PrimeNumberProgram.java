package z_interviewprograms;

import java.util.Scanner;

public class PrimeNumberProgram {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter any number");
		int n = myObj.nextInt(); // Read user input

		boolean result = false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				result = true;
			}
			i++;
		}

		if (result) {
			System.out.println("its a not prime number");
		} else {
			System.out.println("its prime number");
		}
	}

}
