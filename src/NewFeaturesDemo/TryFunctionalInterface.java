package NewFeaturesDemo;

interface FunIn{
	
	public int sum(int a, int b , int c);
}
public class TryFunctionalInterface implements FunIn {
	
	public int sum(int a , int b , int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		FunIn tr = new TryFunctionalInterface();
		System.out.println(tr.sum(10, 100, 200));
	}

}
