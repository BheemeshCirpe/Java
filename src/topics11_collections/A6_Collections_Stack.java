package topics11_collections;

import java.util.Stack;

public class A6_Collections_Stack {

	public static void main(String[] args) {

		Stack obj = new Stack();
		
		obj.push(5);
		obj.push(7);
		obj.push(1);
		
		System.out.println(obj);
		obj.remove(0);
		System.out.println(obj);
	
	

	}

}
