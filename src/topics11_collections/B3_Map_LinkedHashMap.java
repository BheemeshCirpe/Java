package topics11_collections;

import java.util.LinkedHashMap;

public class B3_Map_LinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap obj= new LinkedHashMap();
		
		obj.put("Name", "Sai");
		obj.put("Roll Number", "1234");
		obj.put("Branch", "Mechanical");
		obj.put("Roll Number", "2244");
		//obj.put("Roll Number", "1234");
		obj.put(null, null);
		obj.put("Test", null);
		obj.put(null, "abc");

		
		System.out.println(obj);
		
		System.out.println(obj.containsKey("Name1"));
		System.out.println(obj.containsValue("5244"));
		
		System.out.println(obj.get("Name"));
		
		

	}

}
