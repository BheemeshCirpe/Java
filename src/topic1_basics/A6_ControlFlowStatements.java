package topic1_basics;

public class A6_ControlFlowStatements {

	public static void main(String[] args) {
		
		int i=1;
		 
		while(i<=10)
		{
			System.out.println("This is While loop "+i);
			i=i+1;
			
			if(i==5)
				break;
		}
		
		System.out.println("This is afer while loop");
		
	}
}
