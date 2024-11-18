package MultiThreading;

class Thread1 extends Thread{
	
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("Thread1 "+i);
		}
	}
}

class Thread2 extends Thread{
	
	public void run() {
		for(int i=1; i<11; i++) {
			System.out.println("Thread2 "+i);
		}
	}
}

class Thread3 extends Thread{
	
	public void run() {
		for(int i=1; i<12; i++) {
			System.out.println("Thread3 "+i);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();
		Thread3 t3 = new Thread3();
		t3.start();
	}
	
}
