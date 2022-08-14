package interface_use;

// A class which provides definition to all incomplete methods which are present in interface 
// with the help of implements keyword  called as implementation class
// 
public class Implementation_class implements MyInterface {

	public static void main(String[] args) 
	{
		Implementation_class I= new Implementation_class();
		I.test1();
		I.test2();

	}

	public void test1() {
		System.out.println("Test1 completed in IC");
		
	}

	
	public void test2() {
		System.out.println("Test2 completed in IC");
		
	}

}
