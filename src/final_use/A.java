package final_use;

public  class A {

	public static void main(String[] args) 
	{
		int a= 20;
		
		System.out.println("Value of a is "+a);
		 a=a+30;
		System.out.println("Value of a is "+a);
		
		
	 int b=40;
	 b=b+20;
	 System.out.println(b);
		// b=30+b;    final variable wont alllow us updating its value.

	}

	
	 public  void test()
	 {
		 System.out.println("A's Test Method");
	 }
	 
	 
}
