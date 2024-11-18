package OOPDemo.Keyword;
class Demo{
	static int a= 10;
	static void getDemo() {
		System.out.println("This is a static method");
	}
	static {
		System.out.println("this is a static constructor");
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
		
//		System.out.println(Demo.a);
		Demo.a=50;
		Demo.a=60;
		System.out.println(Demo.a);
		Demo.getDemo();
	}
}
