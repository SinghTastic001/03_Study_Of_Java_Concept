package ConditionalStatement;

import java.util.Scanner;

public class ElseIfLadderEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter only one number form this 9, 3, 6");
		
		int time = sc.nextInt();
		
		if(time==9) {
			System.out.println("good morning");
		}else if(time==3) {
			System.out.println("good afternoon");
		}else if(time==6) {
			System.out.println("good evening");
		}else {
			System.out.println("you are typing another number");
		}
	}
}
