package OOPDemo.TwoTypeInheritance.IsA;

// In hybrid inheritance :- If more than one inheritance implemented or existed called hybrid inheritance.

class GrandFather1{
	void grand() {
		System.out.println("grand");
	}
}
class Father2 extends GrandFather1{
	void father() {
		System.out.println("father");
	}
}
class Son2 extends Father2{
	void son() {
		System.out.println("son");
	}
}
class Daughter1 extends Father2{
	void Dau() {
		System.out.println("daughter");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		Daughter1 d = new Daughter1();
		d.father();
		d.Dau();
	}
}
