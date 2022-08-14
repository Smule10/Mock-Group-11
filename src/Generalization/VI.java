package Generalization;

public class VI  implements TRAI
{

	@Override
	public void call()
	{
		
		System.out.println("Calling Rate is 1 Paisa/Sec for VI");
		System.out.println("===================");
	}

	@Override
	public void data() {
		System.out.println(" VI Daily 1 GB Data is free and futher data is chargabale");
		System.out.println("===================");
		
	}

	@Override
	public void msg() {
		System.out.println("Dairy 10 msg are free VI Customer further msg at 1/rupee ");
		System.out.println("===================");
	}

	
	 public void entertmaint()
	 {
		 System.out.println("SonyLive is free for VI customer");
		 System.out.println("===================");
	 }
}
