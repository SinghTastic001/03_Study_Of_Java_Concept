package Operators;

public class UnaryOp {

	public static void main(String[] args) {
		
		int num1 = 10;
		++num1;
		System.out.println(num1);
		
		int a1 = 20;
		System.out.println(a1++);
		System.out.println(a1);
		
		int num2 = 30;
		num2++;
		System.out.println(num2);
		
		
		int a = -11;

		System.out.println(a++);
		System.out.println(++a);
		System.out.println(~a);
//		System.out.println(a);
//		System.out.println(++a);
//		System.out.println(a--);
//		System.out.println(--a);
//		
//		boolean valid = true;
//		System.out.println(!valid);
	}
}
