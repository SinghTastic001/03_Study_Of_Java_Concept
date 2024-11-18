package OOPDemo.Polymorphism;


// method overriding also known as runtime polymorphism
class Mother2{
	
	public void getInfo() {
		System.out.println("mother");
	}
}
class Daughter3 extends Mother2{
	
	public void getInfo() {
		super.getInfo();
//		here we put mannualy super keyword to access parent method
		
		System.out.println("daughter");
	}
}
public class MethodOverridingDemo {
	public static void main(String[] args) {
		
		Daughter3 d = new Daughter3();
		d.getInfo();
		
//		Mother2 m = new Mother2();
//		m.getInfo();
	}

}
