package OOPDemo;

class StudentDetails{
	
	int id;
	String name;
	String surname;
	String email;
	String location;
	
//	state define here 
	
	void getStudent(int id, String name , String surname , String email , String location) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.location = location;
		
		System.out.println(id+" "+name+" "+surname+" "+email+" "+location);
	}
}

public class ObjectDemo {
	
	public static void main(String[] args) {
		
		StudentDetails sd = new StudentDetails();
		sd.getStudent(1, "shubhi","singh", "s@gmail.com", "vasai");
		
		StudentDetails sd1 = new StudentDetails();
		sd1.getStudent(2, "pallavi", "singh", "p@gmail.com", "bhyander");
		
		
	}

}
