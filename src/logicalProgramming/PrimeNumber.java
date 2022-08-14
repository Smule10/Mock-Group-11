package logicalProgramming;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Number Divided by only Two Factors-1 and himself.
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int Num = sc.nextInt();
		
         if (Num%2==1 || Num%3==1)
         {
        	 System.out.println("Given Number Is Prime Number");
         }
         else {
        	 System.out.println("Given Number Is Not Prime");
         }
	}

}
