package logicalProgramming;

import java.util.Scanner;

import Loop_Study.For_loop;

public class PalendromeString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name");
		String S = sc.next();
		String R= "";
		
	   for(int i=S.length()-1; i>=0; i--) 
	   {
		 R=R+S.charAt(i);
		 System.out.println(R);
	   }
         
	   if(S.equalsIgnoreCase(R))
	   {
		   System.out.println("Given Name is Palendrome");
	   }
	   else {
		   System.out.println("Given Name is Not Palendrome");
	   }
	}

}
