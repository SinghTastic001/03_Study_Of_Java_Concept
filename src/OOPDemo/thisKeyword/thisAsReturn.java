package OOPDemo.thisKeyword;
class Employee{
	
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	Employee getEmployee() {
		return this;
	}
}
public class thisAsReturn {

	public static void main(String[] args) {
		Employee e = new Employee(1,"shubhi");
//		System.out.println(e.getEmployee());
		Employee s = e.getEmployee();
		System.out.println(e.id);
		System.out.println(e.name);
	}
}
