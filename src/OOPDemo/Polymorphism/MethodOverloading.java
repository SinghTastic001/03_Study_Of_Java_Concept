package OOPDemo.Polymorphism;
// method overloading also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
//this is a mehtodoverloading 
//in that one class inside that multiple method with same name :- put different no. of  parameter , if there are same no of parameter change data type then
//change no of parameter 
//change data type if no of parameter are same


class Calculate{

	public int getSum(int a , int b) {
		return a+b;
	}
	
	public int getSum(int a,int b,int c) {
		return a+b+c;
	}
	public double getSum(double a, int c) {
		return a+c;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Calculate cm = new Calculate();
		int f=cm.getSum(10,10);
		int k=cm.getSum(10, 10, 10);
		System.out.println(cm.getSum(10, 50));
		System.out.println(f);
		System.out.println(k);
	}
}
