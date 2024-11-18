package OOPDemo.Keyword;
class BankDetail{
	int bankEmployee = 10;
	String getBank() {
		return "Bank";
	}
	BankDetail(){
		System.out.println("Bank Constructor of Parent");
	}
}

class BobDetail extends BankDetail{
	int bankEmployee = 20;
	BobDetail(){
//		super as a consntructor, first statement and inside constructor use
//		super();
		System.out.println("Bob Constructor");
	}
	
	void getBob() {
		System.out.println("hello getBob");
		System.out.println("current: "+bankEmployee);
		System.out.println("Super: "+super.bankEmployee);
		
//		System.out.println("current: "+getBank());
		
//		System.out.println("Super: "+ super.getBank());
	}
	String getBank() {
//		super.getBank();
		return "BOB";
		
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		
		BobDetail bob = new BobDetail();
		
//		bob.getBob();
//		System.out.println(bob.getBank());
//		String s = bob.getBank();
//		System.out.println(s);
		System.out.println(bob.getBank());
	}
}
