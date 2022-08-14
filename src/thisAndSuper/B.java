package thisAndSuper;

public class B extends thisSample {
	
	int p=60;

	public static void main(String[] args) 
	{
		B Obj=new B();
		Obj.test();
		

	}

	public void test()
	{
		int p=5;
		
	
		int sum=p+50; // using local varibale
		
		int sum1=this.p+40; // using global variable from same class
		
		int sum2=super.a+60; // using global value of a from thisSample Class.
		
		
		System.out.println("Value of p is "+p);
		System.out.println("Value of sum is "+sum);
		System.out.println("Value of sum1 is "+sum1);
		System.out.println("Value of sum2 is "+sum2);
	}
}
