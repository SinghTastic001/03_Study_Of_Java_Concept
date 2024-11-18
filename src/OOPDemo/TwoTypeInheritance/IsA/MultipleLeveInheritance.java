package OOPDemo.TwoTypeInheritance.IsA;
// multileve inheritance :- here is one parent class and multiple child class there is also relation between child to child

class GrandFather{
	void getGrand() {
		System.out.println("I am great GrandFather");
	}
}
class Father extends GrandFather{
	
	void getFather() {
		System.out.println("I am a great Father");
	}
}

class Son extends Father{
	
	void getSon() {
		System.out.println("I am good son");
	}
}
public class MultipleLeveInheritance {
	
	public static void main(String[] args) {
		
		GrandFather g = new GrandFather();
		g.getGrand();
		
		Father f = new Father();
		f.getFather();
		f.getGrand();
		
		Son s = new Son();
		s.getSon();
		s.getFather();
		s.getGrand();
	}
}
