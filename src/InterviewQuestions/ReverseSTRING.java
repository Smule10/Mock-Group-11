package InterviewQuestions;

public class ReverseSTRING {

	public static void main(String[] args) {
		
		String S= "Shivprasad";
		String Rev="";
		
		int L=S.length();
		System.out.println(L);
		for (int i=L-1; i>=0; i--)
		{
			Rev=Rev+S.charAt(i);
			
		}
         System.out.println(Rev);
       //2. By using StringBufferClass
     	
     	StringBuffer str= new StringBuffer(S);
     System.out.println(str.reverse());	
         
         
	}
	

}
