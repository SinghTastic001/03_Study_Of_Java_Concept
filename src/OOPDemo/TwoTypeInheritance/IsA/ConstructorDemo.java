package OOPDemo.TwoTypeInheritance.IsA;


public class ConstructorDemo {
	
	//this is a paramaterise constructor;
	//constuctor name  should be class name and it don't have  return type

	//method name has different name with type return;

	
	ConstructorDemo(){
		
		System.out.println("custom Constructor.... without parameter called non paramatrised constructor");
	}
	
	ConstructorDemo(int a , int b){
		
		System.out.println("custom...Constructor ....it's a parameterised constuctor bcoz it has parameter");
		System.out.println("sum is "+(a+b));
	}
	
	public ConstructorDemo(int a , char b){
			
			System.out.println("custom...Constructor ....it's a parameterised constuctor bcoz it has parameter");
			System.out.println(a+" "+b);
		}
		
	public static void main(String[] args) {
		
		ConstructorDemo cons = new ConstructorDemo(10,'d');
		
	}

}

