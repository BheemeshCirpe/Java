package topics11_collections;

import java.util.LinkedHashSet;

public class A8_Collections_LinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet obj= new LinkedHashSet();
		
		obj.add(20);
		obj.add('c');
		obj.add("Jr NTR");
		obj.add(true);
		obj.add("Jr NTR");
		obj.add(null);
		obj.add("Ram Charan");
		obj.add("Jr NTR");
		obj.add(null);

		System.out.println(obj);

	}

}
