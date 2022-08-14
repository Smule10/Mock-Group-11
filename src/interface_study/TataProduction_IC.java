package interface_study;

public class TataProduction_IC implements TataLMV

// TaTApRODUCTION implements Sub Interface i.e TataLMV. As we know TataLMV extends Tata,  so
// as Tata IS SuperInterface.
// Tata Production have to complete   all incomplete methods.

{

	public static void main(String[] args) 
	{
		TataProduction_IC TP= new TataProduction_IC();
		TP.Bus();
		TP.car();
		TP.minibus();
		TP.Truck();


	}

	
	public void Truck() {
		System.out.println(" This is super interface Truck");
		
	}


	public void Bus() {
		System.out.println("This is Super Interface Bus");
		
	}

	
	public void car() {
	 System.out.println("This is Sub Interface Car");
		
	}

	
	public void minibus() {
		System.out.println("This is Sub Interface minibus");
		
	}

	
}
