package Practise;

public class nonstaticMethodPractise {

	public static void main(String[] args)
	{
		// Practise on Addition and Subtraction
		
		add();
		
		nonstaticMethodPractise F= new nonstaticMethodPractise();
		F.subs();
		
		read();
		
		nonstaticMethodPractise S= new nonstaticMethodPractise();
		S.trial();
		
		nonstaticpractise k= new nonstaticpractise();
		k.akshay();
		
	}

	public static void add()
	{
		int a;
		int b;
		int D;
		
		a=20;
		b=30;
		D= a+b;
		
		System.out.println("Addition of a & b is "+D);
		
	}
	
	public void subs()
	{
		
		int a;
		int b;
		int D;
		
		a=20;
		b=30;
		D= a-b;
		
		System.out.println("Subtraction of a & b is "+D);
		
	}
	
	
	public static void read()
	{
		
		// this is static type mode. to call static type mode we have two types 
		
		int a;
		int b;
		int d;
		
		a=4;
		b=4;
		d=a*b;
		
		System.out.println("Value of d is "+d);
		
		
	}
	
	
	public void trial()
	{
	
      // this is non static type mode. to call such type of mode we have to create object.
		// to create object
		
		int rollnum;
		float weight;
		
		rollnum= 25;
		weight= 34f;
		
		System.out.println("My roll number is "+rollnum+"My weight is "+weight);
		
		
		// Now we have to create object to call this in main mode .
		
		
	
	
	}
	
}
