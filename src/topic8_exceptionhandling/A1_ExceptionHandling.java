package topic8_exceptionhandling;

import java.io.File;

public class A1_ExceptionHandling {

	public static void main(String[] args) throws InterruptedException   {
		
		System.out.println("This is first statement");
		int a=100/0; //Uncheckced exception
		Thread.sleep(5000); //Checked exception
		
//		int a1[]= {1,2};
//		
//		System.out.println(a1[2]);
		
		String str=null;
		System.out.println(str.length());
		
	
		System.out.println("This is last statement");
	
	}

}
