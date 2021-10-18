package topics11_collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class B1_Collections_TreeSet {

	public static void main(String[] args) {

		TreeSet obj = new TreeSet();

		obj.add("Ram Charan");
		obj.add("Jr NTR");
		obj.add("Bunny");
		obj.add("Ram Charan");
		obj.add("Nani");
		obj.add("Ram Charan");

		System.out.println(obj);

		Iterator<String> itr = obj.iterator();

		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println("Mr " + str);
		}

	}

}
