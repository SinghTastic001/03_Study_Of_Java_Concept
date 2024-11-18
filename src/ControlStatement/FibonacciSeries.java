package ControlStatement;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = a+b;
		
		System.out.print(a+" "+b+" ");
		
		while(c<20) {
			
			a=b;
			b=c;
			c = a+b;
			System.out.print(c+" ");
		}
	}

}
