package OOPDemo.Encapsulation.AcsessModifier;

public class mainDemoAccess {

	public static void main(String[] args) {
		
		PrivateDemoModifier p = new PrivateDemoModifier();
//		String s = p.getName();
//		System.out.println(p.getName("shubhi"));
		p.setName("shubhi");
		System.out.println(p.getName());
//		System.out.println(p.a);
	}
}
