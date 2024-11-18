package ControlStatement;

import java.util.Scanner;

public class ArmStrongNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a armstrong number ");
		
		int num = sc.nextInt();
		
		int countTemp = num;
		int temp = num;
		int count = 0;
		int arm_sum = 0;
		
		while(countTemp>0) {
			count++;
			countTemp = countTemp/10;
		}
		
//		System.out.println(count);
		
		while(temp>0) {
			
			int r = temp%10;
			arm_sum = arm_sum + (int) Math.pow((double)r, (double) count);
			
			temp = temp/10;
		}
		
//		System.out.println(arm_sum);
		
		if(num==arm_sum) {
			System.out.println("it is armstrong number");
		}else {
			System.out.println("it is not armstrong number");
		}
	}

}
