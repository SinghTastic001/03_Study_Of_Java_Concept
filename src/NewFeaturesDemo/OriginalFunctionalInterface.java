package NewFeaturesDemo;

public class OriginalFunctionalInterface {
	
	
	public static void main(String[] args) {
		
//		without implements i create java demo interface object here
//		this is a lambda expression
		Demo sum = (int a , int b , int c)->{
			return a+b+c;
		};
		
		
		Demo sub = (int a , int b , int c)->{
			return a+b-c;
		};
		
		System.out.println(sub.calc(10, 20, 100));
		System.out.println(sum.calc(10, 5, 5));
	}

}
