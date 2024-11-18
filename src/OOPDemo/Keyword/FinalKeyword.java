package OOPDemo.Keyword;

class A{
	
	 int a = 20;
	final int b =1000;
	 
	 void getA() {
		System.out.println("A");
	}
}

class B extends A{
	
	int a = 30;
	int b = 5000;
	void getB(){
		System.out.println("B");
	}
	
	final void getA() {
		System.out.println("A");
	}
}
public class FinalKeyword {


	//final with class (class not extends)
	//final with variable (variable value then  not change)
	// final with methods (method not override then)
}
