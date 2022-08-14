package accessSpecifier;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1();
Test2();

	
		
		
		

	}

				
				
				// Four types of AccessSpecifiers 
				// 1. Private-- Scope is WITHIN Class -- Represent -- Red Square 
				// 2. Public.-- Scope is WITHIN PROJECT  -- Represent -- Green circle. 
				//3.  Default.-- scope is WITHIN PACKAGE -- Represent -- Blue Triangle
				// 4. Protected.-- Scope is within Package, We can call out of package using Inheritance..
			  
				
				public static  void Test1()
				{ int a=10; int b=20;
				int c=a+b;
					System.out.println("Value of C is "+c);}
				
				public static void Test2() 
				{ int a=4; int b=5; int c= a*b; 
				System.out.println("Value of test2 is "+c);
				}
				
			    void test3()
			 { int a=20; int b=10; int c= a-b;
			 System.out.println("Result of test3 is "+c);
			 }
			    
			    protected void test4() 
			    {int a=30; int  b=6; int c=a/b; System.out.println("Reult of test4 is "+c); 
			    	
			    }
			

	}


