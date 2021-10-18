package topic1_basics;

public class A5_ControlFlowStatements {

	public static void main(String[] args) {
		int a = 30;
		int b = 10;

		switch (a) {

		case 10:
			System.out.println("This is for value 10");
			break;
		case 20:
			System.out.println("This is for value 20");
			break;
		case 30:
			System.out.println("This is for value 30");
			break;
		default:
			System.out.println("This is for value 40");
			break;

		}

		System.out.println("This is last statment");
	}

}
