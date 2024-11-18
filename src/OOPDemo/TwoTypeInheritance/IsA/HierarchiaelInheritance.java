package OOPDemo.TwoTypeInheritance.IsA;
// In hierarchieal inheritance :-  here is only one parent classs and multiple child class and there is no relation between child to child

class Father1{
	void getFather() {
		System.out.println("I am the best father");
	}
}

class Daughter extends Father1{
	
	void getDaughter() {
		System.out.println("I am the best Daughter");
	}
}

class Son1 extends Father1{
	
	void getSon() {
		System.out.println("I am the best Son");
	}
}

public class HierarchiaelInheritance {
	
	public static void main(String[] args) {
		
		Father1 f = new Father1();
		f.getFather();
		
		Daughter d = new Daughter();
		d.getDaughter();
		d.getFather();
		Son1 s = new Son1();
		s.getSon();
		s.getFather();
	}

}


