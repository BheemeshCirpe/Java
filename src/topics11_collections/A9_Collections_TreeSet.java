package topics11_collections;

import java.util.TreeSet;

public class A9_Collections_TreeSet {

	public static void main(String[] args) {

		TreeSet obj = new TreeSet();

		obj.add(10);
		obj.add(40);
		obj.add("Test"); //TreeSet only accepts homogeneous data
		obj.add(1);
		obj.add(0);

		System.out.println(obj);

	}

}
