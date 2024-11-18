package OOPDemo;

class User{
	
	int id;
	String name;
	String surname;
	String location;
	String email;
}

public class MethodDemo1 {
	
	User getUser(){
		User u = new User();
		
		u.name = "shubhi";
		u.surname = "singh";
		u.location = "vasai";
		u.email = "s@gmail.com";
		
		return u;
	}
	
	public static void main(String[] args) {
		
//		User us = new User();
		
		MethodDemo1 md = new MethodDemo1();
		System.out.println(md.getUser().email);
		User d = md.getUser();
		System.out.println(d.name);
		
		
	}

}
