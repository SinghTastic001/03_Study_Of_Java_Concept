package WrapperDemo;

public class WrapperDemoo {
	
	public static void main(String[] args) {
		
		int num = 10;
		String val = String.valueOf(num);
		
		System.out.println(val+" string");
		
		Integer num1 = Integer.valueOf(num);
		System.out.println(num1);
		
		String isValid = "sjfdjflklsdjf";
		Boolean check = Boolean.valueOf(isValid);
		
		System.out.println(check);
		
		int a = 20;
		String data = String.valueOf(a);
		System.out.println(data.getClass());
		
		String num3 = "20";
//		Integer n = Integer.valueOf(num);
		Integer n = Integer.valueOf(num3);
		System.out.println(n+" : "+n.getClass().getName());
		
		
		String isValid1 = "vuvyuv";
		Boolean b = Boolean.valueOf(isValid1);
		System.out.println(b);
		
		
		String s = "subhi";
		Integer nk = Integer.valueOf(s);
		System.out.println(nk+" : "+nk.getClass().getName());
		
		
		
		
	}

}
