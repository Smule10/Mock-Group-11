package Variable;

public class typesOfVariable 

{
  int a = 20; // Non Static G.V. (Instance Variable)
  static int b=5;   // Static G.V
  
  
	public static void main(String[] args)
	
	{
		int a=6;
		
		int c=10;
		
		System.out.println(c);
		System.out.println("Value of A is "+a);
		name();
		
	 // typesOfVariable V=new typesOfVariable();
	//  V.name();
	}
	
	public static  void name()
	{
		System.out.println(b);
		
	}
	

	
	}