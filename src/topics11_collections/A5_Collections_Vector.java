package topics11_collections;

import java.util.Vector;

public class A5_Collections_Vector {

	public static void main(String[] args) {
		
		
		Vector obj= new Vector();
		
		obj.add(1);
		obj.add('c');
		obj.add(34.6);
		obj.add(null);
		obj.add("Test");
		obj.add('c');
		
		
		System.out.println(obj);

	}

}
