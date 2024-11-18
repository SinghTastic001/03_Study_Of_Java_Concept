package TypeCasting;

public class TypeCasting {
	
	public static void main(String[] args) {
		
//		widening (implicitly) casting 
		
		char value = 'A';
		int num = (int) value;
		System.out.println(num);
		System.out.println(value);
		
		float flt = (float) value;
		System.out.println(flt);
		
		
//		narrowing (explicitly) casting
		
		double d1 = 10d;
		int int1 = (int) d1;
		System.out.println(d1);
		System.out.println(int1);
		
		float ch = (float) d1;
		System.out.println(ch);
	}

}
