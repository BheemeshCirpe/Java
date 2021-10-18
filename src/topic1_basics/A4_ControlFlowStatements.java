package topic1_basics;

public class A4_ControlFlowStatements {

	public static void main(String[] args) {
		
		System.out.println("This is first ");
		
		boolean a=false;
		boolean b=true;
		
		if(a)
		{
			System.out.println("This is if statement-1");
			
			if(b)
			{
				System.out.println("This is nested if");
			}
			
			System.out.println("This if statement-2");
		}

		System.out.println("This is Last");
	}


}
