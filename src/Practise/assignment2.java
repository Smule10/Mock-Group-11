package Practise;

public class assignment2 {

	public static void main(String[] args) 
	{
    // Calling static method from same class//
		assignment2.student1();
	// Calling Non Static method without parameter//
		assignment2 S=new assignment2();
		S.student2();
   // Calling Static method with Parameter//
		assignment2.student3("Aditya", 27, 'M', 62.5f, "Engineering", "instru");
	// Calling Non Static Method With Parameter //
		
		S.student4("Rameshwar", 27, 'M', 87.8f, "Engineering", "Instru");
		S.student4("Yogesh", 27, 'M', 87.8f, "Engineering", "Instru");
		
		// Calling Non Static method from Different Method //
		
	S.subjects(80, 90, 75);
      
	}

	// Student info on Static Method ( Without Parameter)
	
	public static void student1() // method without parameter)
	{
		String name;
		name = "Shivprasad";
		int age;
		age= 27;
		char gender;
		gender='M';
		float weight;
		weight=64.3f;
		String dept;
		dept= "Engineering";
		String branch;
		branch= "Instru";
		
		System.out.println("=========================================");
		System.out.println("This is Static Method Without Paramter");
		System.out.println("--------------------");
		System.out.println("Student Name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student Gender is "+gender);
		System.out.println("Student Weight is "+weight);
		System.out.println("Student Dept is "+dept);
		System.out.println("Student Branch is "+branch);	
	}
	public void student2() 
	{
		String name;
		name = "Shivprasad";
		int age;
		age= 27;
		char gender;
		gender='M';
		float weight;
		weight=64.3f;
		String dept;
		dept= "Engineering";
		String branch;
		branch= "Instru";
		
		System.out.println("==================================");
		System.out.println("This is Non-Static Method Without Paramter");
		System.out.println("--------------------");
		System.out.println("Student Name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student Gender is "+gender);
		System.out.println("Student Weight is "+weight);
		System.out.println("Student Dept is "+dept);
		System.out.println("Student Branch is "+branch);	
	}
	
	// This is Non-Static method with Parameter.
	public void student( String name, int age, char gender, float weight, String dept, String branch )
	
	{
		System.out.println("==================================");
		System.out.println("This is Non-Static Method Without Paramter");
		System.out.println("--------------------");
		System.out.println("Student Name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student Gender is "+gender);
		System.out.println("Student Weight is "+weight);
		System.out.println("Student Dept is "+dept);
		System.out.println("Student Branch is "+branch);	
		

	}
	
	// This is Static method with parameter//
	
	public static void student3(String name, int age, char gender, float weight, String dept, String branch ) 
	{
		System.out.println("==================================");
		System.out.println("This is Static Method With Paramter");
		System.out.println("--------------------");
		System.out.println("Student Name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student Gender is "+gender);
		System.out.println("Student Weight is "+weight);
		System.out.println("Student Dept is "+dept);
		System.out.println("Student Branch is "+branch);
		}
	
	// This is Non Static Method with Parameters//
	
	public void student4(String name, int age, char gender, float weight, String dept, String branch) 
	{
		System.out.println("==================================");
		System.out.println("This is Non-Static Method With Paramter");
		System.out.println("--------------------");
		System.out.println("Student Name is "+name);
		System.out.println("Student age is "+age);
		System.out.println("Student Gender is "+gender);
		System.out.println("Student Weight is "+weight);
		System.out.println("Student Dept is "+dept);
		System.out.println("Student Branch is "+branch);
		
		
	}
	
	public void subjects( int sub1, int sub2, int sub3)
	{
		System.out.println("==================================");
		System.out.println("Marks in Science : " +sub1);	
		System.out.println("Marks in Math : "  +sub2);	
		System.out.println("Marks in English : "  +sub3);	
	}
}

