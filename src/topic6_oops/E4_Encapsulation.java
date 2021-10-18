package topic6_oops;

public class E4_Encapsulation {

	public static void main(String[] args) {
	
		E3_Encapsulation obj= new E3_Encapsulation();
		
		obj.setId(100);
		obj.setName("Bheemesh");
		
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		
		obj.setId(101);
		obj.setName("Sai");
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());

	}

}
