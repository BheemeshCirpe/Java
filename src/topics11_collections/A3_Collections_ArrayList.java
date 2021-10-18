package topics11_collections;

import java.util.ArrayList;

public class A3_Collections_ArrayList {

	public static void main(String[] args) {
		
		ArrayList obj= new ArrayList();
		
		obj.add(1);
		obj.add(6);
		obj.add(3);
		obj.add(0, 5);
		
		System.out.println(obj);
		
		System.out.println(obj.get(3));
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println(obj.remove(3));
		System.out.println(obj);
	
		
		

	}

}
