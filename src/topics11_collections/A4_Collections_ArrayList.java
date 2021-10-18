package topics11_collections;

import java.util.ArrayList;

public class A4_Collections_ArrayList {

	public static void main(String[] args) {

		ArrayList obj = new ArrayList();
		
		A4_Collections_ArrayList obj1= new A4_Collections_ArrayList();

		obj.add(6);
		obj.add(1);
		obj.add(2);
		obj.add(obj1);

		
		System.out.println(obj);

	}

}
