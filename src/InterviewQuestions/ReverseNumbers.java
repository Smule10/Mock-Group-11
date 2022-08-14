package InterviewQuestions;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println();
		int num= sc.nextInt();
		
		
		// By using String Buffer Class.1st Need to Crete Rev Variable as a Stringbuffer.
		
		StringBuffer rev;
		
		//2. Need to create onj of strngbuffer
		
		StringBuffer strf= new StringBuffer(String.valueOf(num) );
		
		strf.reverse();
		
		System.out.println(strf);

	}

}
