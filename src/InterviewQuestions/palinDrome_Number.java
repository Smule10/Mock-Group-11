package InterviewQuestions;

public class palinDrome_Number {

	public static void main(String[] args) {
		String S="5555556";
		//1. By using String Buffer Class
		
		StringBuffer str= new StringBuffer(S);
		System.out.println(str.reverse());

	}

}
