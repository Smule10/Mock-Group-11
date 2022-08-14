package abstractClass;

public class dashboard extends login_page {

	public static void main(String[] args) {
		dashboard D = new dashboard();
		D.Name();
		D.Email_id();
		D.Num();
		D.Password();
		D.login_succesful();
		D.Welcome();
		D.withdrawl();
		D.statement();

	}

	@Override
	public void Welcome() {
		System.out.println("Welcome to Cosmos Bank Online Banking");
		
	}

	public void withdrawl() {
		System.out.println("Please Enter Amount to withdraw");
	}
	private void statement ()
	{
		System.out.println("Please select date range for Statement");
	}
}
