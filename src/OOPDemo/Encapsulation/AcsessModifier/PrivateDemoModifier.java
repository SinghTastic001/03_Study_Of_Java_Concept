package OOPDemo.Encapsulation.AcsessModifier;
// private variable access using set and get method
public class PrivateDemoModifier {
	
	private String name;
	private int a = 200;
	
	private void getData() {
		System.out.println("This is a private method");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	PrivateDemoModifier(){
		System.out.println("This is a private constructor");
	}
	
	public static void main(String[] args) {
		
		PrivateDemoModifier p = new PrivateDemoModifier();
		p.setName("Singh");
		System.out.println(p.getName());
		System.out.println(p.a);
//		System.out.println(p.getData());
		p.getData();
	}

}
