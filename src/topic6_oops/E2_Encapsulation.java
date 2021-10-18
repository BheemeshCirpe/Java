package topic6_oops;

public class E2_Encapsulation {

	public static void main(String[] args) {

		E1_Encapsulation obj = new E1_Encapsulation();

		obj.setterMethod(100);
		obj.setName("Bheemesh");

		int x = obj.getterMethod();
		
		String y=obj.getName();

		System.out.println(x);
		System.out.println(y);
		
		System.out.println(obj.k);
		obj.k=900;
		System.out.println(obj.k);

	}

}
