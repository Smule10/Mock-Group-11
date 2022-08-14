package logicalProgramming;

public class WhiteSpacesInString {

	public static void main(String[] args) 
	{
	   String S= " Yes,  You can Also  do It";
	  
	   int Count = 0;
	   for (int i=0; i<=S.length()-1; i++)
	   {
		  char C = S.charAt(i);
		  
		  if ( C==' ')
		  {
			  Count++;
		  }
		  
		  
	   }
	   
	   System.out.println("White Spaces In Given String is "+Count);
	}

}
