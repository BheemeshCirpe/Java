package topics11_collections;

import java.util.HashMap;
import java.util.Set;

public class B5_Map_HashMap_2 {

	public static void main(String[] args) {

		HashMap obj = new HashMap();

		obj.put("Name", "Sai");
		obj.put("Roll Number", "1234");
		obj.put("Branch", "Mechanical");
		
		Set s=obj.keySet();
		
		System.out.println(s);
		
		System.out.println(obj.values());
		
		

	}

}
