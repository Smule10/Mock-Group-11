package logicalProgramming;

public class PrimeNumbersBetween1to100 {

			   public static void main (String[] args)
			   {		
			       
			       
			       //Empty String
			       String  primeNumbers = "";

			       for (int i = 1; i <= 100; i++)  //1,2,3,4  
			       { 		  	  
			          int counter=0; 	  
			          for(int num =i; num>=1; num--) // 1,2,3,4
				  {
			             if(i%num==0)
				     {
			 		counter = counter + 1; // 1
				     }
				  }
				  if (counter ==2)
				  {
				     //Appended the Prime number to the String
				     primeNumbers = primeNumbers + i + " ";
				  }	
			       }	
			       System.out.println("Prime numbers from 1 to 100 are :");
			       System.out.println(primeNumbers);
			   }
			

	}


