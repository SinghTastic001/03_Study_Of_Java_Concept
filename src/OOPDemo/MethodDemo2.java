package OOPDemo;

class User1{
	
	String name;
	String surname;
	String email;
	String phone;
	
//	state define here only
}

public class MethodDemo2 {
	
	void getUser(User1 u) {
		
		System.out.println(u.name);
		System.out.println(u.surname);
		System.out.println(u.phone);
	}
	
	public static void main(String[] args) {
		
		User1 us = new User1();
		us.name = "pallavi";
		us.surname =  "singh";
		us.email = "ps@gmail.com";
		us.phone = "9988776655";
		
		User1 us1 = new User1();
		us1.name = "pallavi1";
		us1.surname =  "singh1";
		us1.email = "ps@gmail.com1";
		us1.phone = "9988776644";
		
		MethodDemo2 md = new MethodDemo2();
		md.getUser(us);
		md.getUser(us1);
	}

}
