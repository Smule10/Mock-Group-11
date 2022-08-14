package thisAndSuper;

public class thisSample {
	
	int a=20;  // NonStatic Global Variables
	int b=10;    // NonStatic Global Variables

	public static void main(String[] args) 
	{
	 thisSample T=new thisSample();
	  T.demo();
	  
	  

	}

	
	 public void demo()
	 {
		 int a=5; // non Static Local variables
		 int b=4;
		 int mul=a*b;
		 System.out.println("Value of mul is "+mul);
		
		 
		 int sum=this.a+10;
		 System.out.println("Sum is "+sum);
	 }
	 
	 
}

