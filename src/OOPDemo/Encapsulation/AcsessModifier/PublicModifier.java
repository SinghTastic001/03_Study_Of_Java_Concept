package OOPDemo.Encapsulation.AcsessModifier;
//two public class not exit in single file

class PubDemo{
	
	PubDemo(int a){
		System.out.println(a);
	}
	public void getDemo() {
		System.out.println("Public Demo Example Method");
	}
	
}
public class PublicModifier {

	public int b = 100;
	public String name="shubhi";
	public void getData() {
		System.out.println("This is a public method of class public modifier");
		
	}
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return b;
	}
	
	public static void main(String[] args) {
		
		PubDemo pd = new PubDemo(42);
		pd.getDemo();
		
		PublicModifier pm = new PublicModifier();
		String s = pm.getName();
		System.out.println(s);
		
		
//		default tryyyy
		
		DefaultDemo d = new DefaultDemo();
		System.out.println(d.c);
		
//		default test 
		
		ProtectedDemo  pc = new  ProtectedDemo();
		 pc.getData();
		 pc.getSname();
	}
}
