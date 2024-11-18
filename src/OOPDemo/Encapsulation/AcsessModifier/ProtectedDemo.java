package OOPDemo.Encapsulation.AcsessModifier;



public class ProtectedDemo {

	protected int a = 5;
	protected String name = "shubhi";
	
	protected void getData() {
		System.out.println("this is a protected");
		System.out.println(a);
		
	}
	protected String getSname() {
		return name;
	}

	public static void main(String[] args) {
		ProtectedDemo  pc = new  ProtectedDemo();
		 pc.getData();
		 pc.getSname();
	}
}
