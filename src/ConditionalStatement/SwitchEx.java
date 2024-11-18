package ConditionalStatement;

import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		System.out.println("1.sum\n2.sub\n3.mul\n4.div\n5.mod");
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter what u want to do in calculation");
		int cal = sc.nextInt();
		int num1 = 10;
		int num2 = 20;
		switch(cal) {
		
			case 1:
				System.out.println(num1+num2+" sum");
				break;
			case 2:
				System.out.println(num1-num2+" sub");
				break;
			case 3:
				System.out.println(num1*num2+" mul");
				break;
			case 4:
				System.out.println(num1/num2+" div");
				break;
			case 5:
				System.out.println(num1%num2+" mod");
				break;
			default:
				System.out.println("you enter some other number ");
				break;
				
		}
	}

}
