package MultiThreading;
class Th1 implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Thread1: "+i);
		}
	}
}

class Th2 implements Runnable{
	
	public void run() {
		for(int i=1; i<=11; i++) {
			System.out.println("Thread2: "+i);
		}
	}
}
public class RunnableDemo {
	
	public static void main(String[] args) {
		
		Th1 r1 = new Th1();
		Thread t1 = new Thread(r1);
		t1.start();
		t1.setPriority(1);
		
		Th2 r2 = new Th2();
		Thread t2 = new Thread(r2);
		t2.start();
		t2.setPriority(10);
		

		for(int i=0; i<10; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
