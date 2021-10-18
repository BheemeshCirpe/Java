package topic1_basics;

public class A8_ControlFlowStatements {

	public static void main(String[] args) {

	
		for(int i=1;i<=10;i++ )
		{
			if(i==7)
				continue;
			System.out.println("This is for loop "+i); 
			System.out.println("Test"); 
			
		}

		System.out.println("This is after for loop");
		
		
	}
}
