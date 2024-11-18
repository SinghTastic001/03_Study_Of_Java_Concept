package StringInBuilt;

import java.util.Scanner;

//string immutable
public class StringMethod1 {
	
	public static void main(String[] args) {
		
//		String name = "Shubhi Singh";
//		System.out.println(name.toLowerCase());
//		System.out.println(name.toUpperCase());
//		System.out.println(name.length());
//		System.out.println(name.charAt(5));
//		
//		String a1 = "Shubhi";
//		String a2 = "Shubhi";
//		String a3 = new String("SHUBHI");
//		
//		System.out.println(a1==a2);
//		System.out.println(a1==a3);
//		
//		
//		
//		System.out.println(a1.equalsIgnoreCase(a3));
//		
		String s1 = "Shubmi";
		String s2 = "Shubi";
		
		System.out.println(s1.compareTo(s2));
//		if first is smll then it return negative value....
//		if first is bigger then it return positive value..a1.
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		System.out.println(st);
	}

}
