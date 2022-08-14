package abstractClass;

public abstract class login_page extends sign_up 
 
{

	@Override
	public void Num() 

	{ System.out.println (" Phone Num is +9970322334 ");
		
	}

	@Override
	public void Password() {
		System.out.println("Password is ******");
		
	}

	public void login_succesful ()
	{
		System.out.println("Log in is successful");
	}
	
	public abstract void Welcome();
	
}
