package OOPDemo.Encapsulation.AcsessModifier;

public class DefaultDemo {

	int a = 1010;
	int c = 200;
	String name ;
	
	void getData() {
		System.out.println("This is a default method");
	}
	
	String getSurname() {
		return name;
	}
	
	public static void main(String[] args) {
		DefaultDemo d = new DefaultDemo();
		System.out.println(d.c);
	}
}
