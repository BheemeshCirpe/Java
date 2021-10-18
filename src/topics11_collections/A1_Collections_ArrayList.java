package topics11_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A1_Collections_ArrayList {

	public static void main(String[] args) {

		ArrayList obj = new ArrayList();

		obj.add(2);
		obj.add(34.5);
		obj.add("Bheemesh");
		obj.add('c');
		obj.add(true);
		obj.add("Bheemesh");
		obj.add(null);
		obj.add(2);
		obj.add("Bheemesh");
		obj.add(null);

//		System.out.println(obj);
//		System.out.println(obj.get(0));
//		
		Iterator itr = obj.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		ListIterator itr1 = obj.listIterator();

		while (itr1.hasNext()) {

			System.out.println(itr1.next());

		}

	}

}
