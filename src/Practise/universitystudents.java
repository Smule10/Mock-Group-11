package Practise;

public class universitystudents {

	public static void main(String[] args) {
		// name, PRN, branch, dept, gender, passoutyear, weight
		
		// Caliing non-static method need to create object.
		
		universitystudents us=new universitystudents();
		us.studentinfo();
		
		// caliing static method 
universitystudents.studentinfo("Aditya", "PUN23456", "engg", "instru", 'M');
	 
		

	}

	
	public void studentinfo() // method without parameters
	{
		String name;
		name= "shivprasad";
		
		String PRN;
		PRN= "PUN12345";
		
		String dept;
		dept = "Engg";
		String branch;
		branch = "Instru";
		
		
		
		System.out.println("Student name is "+name);
		System.out.println("Student's PRN Nuber is "+PRN);
		System.out.println("Student dept is "+dept);
		System.out.println("Student branch is "+branch);
		
	}
	
	 public static void studentinfo( String name , String PRN, String dept, String branch, char gender) 
	 {
		 
		 System.out.println("===================================");
			System.out.println("Student name is "+name);
			System.out.println("Student's PRN Nuber is "+PRN);
			System.out.println("Student dept is "+dept);
			System.out.println("Student branch is "+branch);
			System.out.println("Student's gender is "+gender);
			
	 }
}
