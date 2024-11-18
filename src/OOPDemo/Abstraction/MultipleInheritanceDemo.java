package OOPDemo.Abstraction;
interface FirstInterface{
	public void myMethod();
}
interface SecondInterface{
	public void myMethod();
	public void myOtherMethod();
}

class DemoClass implements FirstInterface,SecondInterface{
	
	public void myMethod() {
		System.out.println("MyMethod of first");
	}

	@Override
	public void myOtherMethod() {
		// TODO Auto-generated method stub
		System.out.println("myothermethod");
	}
	

	
}
public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		
//		DemoClass d = new DemoClass();
//		d.myMethod();
//		d.myOtherMethod();
		
		FirstInterface f = new DemoClass();
		f.myMethod();
		SecondInterface s = new DemoClass();
		s.myMethod();
		s.myOtherMethod();
	}
}
