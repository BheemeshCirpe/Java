package topic6_oops;

public class C4_Polymorphism_Overriding {

	public static void main(String[] args) {

		C4_Polymorphism_Overriding obj = new C4_Polymorphism_Overriding(); // Parent lo Parent
		ChildD obj1 = new ChildD(); // Child lo Child

		C4_Polymorphism_Overriding obj2 = new ChildD(); // Parent lo child

//		ChildD obj3= new C4_Polymorphism_Overloading();

	}

}

class ChildD extends C4_Polymorphism_Overriding {

}