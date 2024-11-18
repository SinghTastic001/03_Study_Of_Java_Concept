package OOPDemo.Keyword;
//super keyword  use when overriding occur it means here is inheritance occur
//super keyword use three way 1.with method 2.with constructor

class Bank {
	
	int bankEmployee = 100;

//	constructor name same as class name and it has not define any return type
	Bank() {
		System.out.println("Bank custome constructor ");
	}

//	void return type return nothing it's only print
	void getBank() {
		System.out.println("Bank");
	}
}

class Bob extends Bank {
	
	int bankEmployee = 20;

	Bob() {

// 	constructor ke shaat super keyword automatic lagta h hmm nhi lagate
		System.out.println("Bob custom Constuctor");
	}

	Bob(int a) {
//		super inside consntructor, use as  first statement and inside constructor use
// 	constructor ke shaat super keyword automatic lagta h hmm nhi lagate
		System.out.println("Bob custom Constuctor");
		System.out.println(a);
	}

	void getBank() {

//		access parent method first it is use inside method
		super.getBank();
		System.out.println("Bobban");
		System.out.println("current: "+bankEmployee);
		System.out.println("Super: "+super.bankEmployee);
	}

	void getBob() {
		System.out.println("Bob");
	}
}

public class SuperDemo {


	public static void main(String[] args) {

//		Bank b = new Bank();
//		b.getBank();

		Bob bo = new Bob(10);

		bo.getBank();
//		bo.getBob();

	}
}
