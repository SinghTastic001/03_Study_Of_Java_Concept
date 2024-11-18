package OOPDemo.TwoTypeInheritance.IsA;
// Inheritance means child class access all the property of parent class
// single inheritance :- there is only one parent class and only one child class

class Parent{
	
	void getparent() {
		System.out.println("I am a good parent");
	}
}

class Child extends Parent{
	void getchild() {
		System.out.println("I am a good child");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.getparent();
		
		Child c = new Child();
		c.getchild();
		c.getparent();
	}
}
