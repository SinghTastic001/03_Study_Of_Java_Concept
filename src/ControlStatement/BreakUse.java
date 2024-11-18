package ControlStatement;

public class BreakUse {
	
	public static void main(String[] args) {
		
		String[] ar = {"switchhh","Niki","Pallavi","Malang","Raste","Safar","Goa"};
		
		for(int i=0; i<ar.length; i++) {
//			System.out.println(ar[i]);
			if(ar[i]=="Pallavi") {
				
				break;
			}
			System.out.println(ar[i]);
		}
	}

}
