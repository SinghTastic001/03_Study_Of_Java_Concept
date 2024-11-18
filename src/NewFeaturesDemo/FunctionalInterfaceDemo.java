package NewFeaturesDemo;

interface Anno{
	
	public int sum(int a, int b);
}
public class FunctionalInterfaceDemo implements Anno {
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	public static void main(String[] args) {
		
		Anno dm = new FunctionalInterfaceDemo();
		System.out.println(dm.sum(10,30));	
		
		
	}

	
	

}
