package topic6_oops;

public class E1_Encapsulation {

	private int salary = 1000;
	private String name;
	public int k=100;

	public void setterMethod(int a) {
		salary = a;
	}

	public int getterMethod() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
