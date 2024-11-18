package OOPDemo.thisKeyword;
// this represents current class object.
class Student{
	private String name="Shubhi";
	private String school = "SRKKK";
	private String email;
	private String surname;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Student() {
		System.out.println("constructor");
	}
	
	public void setAll(String name,String email,String surname,String school) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.school = school;
//		this.surname = surname;
	}
	
	public void DetailFetch() {
		System.out.println(this.name+" "+this.surname+" "+this.school+" "+this.email+" ");
	}
	public void studentDetails() {
		System.out.println(this.getName()+" "+this.getSurname()+" "+this.getSchool()+" "+this.getEmail());
	}
	
}
public class thiswithvariable {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Monika");
		s.setSurname("Singh");
		System.out.println(s.getName());
		System.out.println(s.getSchool());
		System.out.println(s.getSurname());
		s.setAll("Muni", "m@gmail", "tiwari", "Peter");
		s.DetailFetch();
		s.studentDetails();
		
	}
}
