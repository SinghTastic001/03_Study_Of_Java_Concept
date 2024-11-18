package ControlStatement;

public class ContinueEx {
	
	public static void main(String[] args) {
		
		
		String[] val = {"switchh","age","id","name","surname"};
		
		for(int i=0; i<val.length; i++) {
			if(val[i]=="id") {
				continue;
			}
			System.out.println(val[i]);
		}
	}

}
