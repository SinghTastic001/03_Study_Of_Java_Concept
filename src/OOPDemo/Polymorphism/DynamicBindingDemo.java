package OOPDemo.Polymorphism;
//	DYNAMIC BINDING ALSO CALLED UPCASTING......IN THE PROCESS A CHILD OBJECT ASSIGN TO THE REFERECE VARIABLE OF THE PARENT CLASS OBJEC LIKE....
//<pARENCT CLASS NAME>  VARIABLE = NEW  <CHILD CLASS NAME>();  THERE IS INHERITANCE NEEN BETWEEN PARENT CLASS AND CHILD CLASS.

class Person{
	
	void getInfo() {
		
		System.out.println("Name is shubhi");
	}
	
	public void getDetail() {
		System.out.println("Shubhi is eating");
	}
}

class Doctor extends Person{
	
	void getName() {
		System.out.println("I am a Doctor");
	}
	
	public void getDetail() {
		System.out.println("Doctor is eating");
	}
}
public class DynamicBindingDemo {

	public static void main(String[] args) {
//		dynamic binding is here
		
		Person p = new Doctor();
		p.getInfo();
		p.getDetail();
		
	}
}
