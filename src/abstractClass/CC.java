package abstractClass;

public class CC extends a1 {

	public static void main(String[] args) {
		CC c=new CC(); // Created object of concrete class
		
		c.Marathi();
		c.English();
		c.Math();
		c.Science();
		c.Sanskrit();
	}
	@Override
	public void Marathi() {System.out.println("3rd Subject for 10th Standard");
		// TODO Auto-generated method stub
	}
    @Override
	public void Sanskrit() {System.out.println("4th Subject for 10th Standard");
		// TODO Auto-generated method stub
		}
    @Override
	void English() {System.out.println("5th Subject for 10th Standard");
		// TODO Auto-generated method stub
    }
}
