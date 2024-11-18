package OOPDemo.Abstraction;

interface Bank{
	int a=100;
	void getBank();
}

class Bob implements Bank{

	public void getBank() {
		System.out.println("Bob");
	}
	
}

class Sbi implements Bank{
	public void getBank() {
		System.out.println("Sbi");
	}
}
public class InterfaceClassDemo {

	public static void main(String[] args) {
		
		Bob b = new Bob();
		Sbi s = new Sbi();
		b.getBank();
		s.getBank();
	}
}
