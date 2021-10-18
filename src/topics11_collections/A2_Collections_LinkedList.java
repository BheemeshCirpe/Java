package topics11_collections;

import java.util.LinkedList;

public class A2_Collections_LinkedList {

	public static void main(String[] args) {

		LinkedList obj = new LinkedList();

		obj.add(2);
		obj.add(34.5);
		obj.add("Bheemesh");
		obj.add('c');
		obj.add(true);
		obj.add("Bheemesh");
		obj.add(null);
		obj.add(2);

		System.out.println(obj);
		
		System.out.println(obj.get(0));

	}

}
