package OOPDemo.thisKeyword;
class Bank{
	
	int noOfEmployee = 200;
	String name = "Bank";
	
	Bank(Axis axis){
		System.out.println(axis.name+" "+axis.noOfEmployee);
	}
}

class Axis{
	int noOfEmployee = 400;
	String name = "Axis";
	
	public void getDetail() {
		Bank bank = new Bank(this);
	}
}
public class thisAsConstructor {
	public static void main(String[] args) {
		
		Axis axis = new Axis();
		axis.getDetail();
	}

}
