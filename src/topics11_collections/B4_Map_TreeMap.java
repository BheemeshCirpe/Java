package topics11_collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class B4_Map_TreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> obj = new TreeMap<String, String>();

		obj.put("Name", "Sai");
		obj.put("Roll Number", "1234");
		obj.put("Branch", "Mechanical");
		obj.put("Roll Number", "6677");
		
		
		System.out.println(obj);

		Set s = obj.keySet();

		Iterator<String> itr = s.iterator();

		obj.values();

		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + " ==>" + obj.get(str));

			System.out.println(str + " " + obj.get(str));
		}

	}

}
