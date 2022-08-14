package constructor;

public class practise1 {
	
	// declaring global variable//
	
	int a;
	int b;
	int c;
	
	public practise1() // User Defined Constructor // Initializing variable
	{
		a=5;
		b=8;
		
		
	}
	
	public practise1(int x)  // Single parameter constructor
	{
		 a=x;
		 //b=0 
	}

	public practise1(int x, int y) // Double Parameter Constructor
	{
		a=x;
		b=y;
		
	
	}
	public practise1(int x , int y, int z) // Constructor with 3 parameter
	{
		a=x;
		b=y;
		c=z;
	}
	public static void main(String[] args) {
		// User defined constructor
		
		practise1 A= new practise1(10);
		A.add();
		practise1 B= new practise1(30, 40);
		B.add();
		practise1 C = new practise1(40, 50, 40);
		C.add();
	}
	public void add()
	{
		int sum;
		sum=a+b+c;
	 System.out.println("Addition is "+sum);
	
	}
	
	
}

