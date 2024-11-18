package ConditionalStatement;

public class NestedIfEx {
	public static void main(String[] args) {
		
		int num1 = 10000;
		int num2 = 1000;
		int num3 = 500;
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("num1 is grater "+num1);
			}else {
				System.out.println("num3 is grater "+num3);
			}
		}else {
			if(num2>num3) {
				System.out.println("num2 is grater "+num2);
			}else {
				System.out.println("num3 is grater "+num3);
			}
		}
	}

}
