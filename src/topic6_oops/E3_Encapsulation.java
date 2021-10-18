package topic6_oops;

public class E3_Encapsulation {

	private int id;
	private String name;

	public int getId() {

		if (id == 100)
			return id;
		else
			return 0;
	}

	public void setId(int id) {
		if (id == 100)
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
