package MultiThreading;
class Thread4 extends Thread{
	
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("Thread1 "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread5 extends Thread{
	
	public void run() {
		for(int i=1; i<11; i++) {
			System.out.println("Thread2 "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemot {

	public static void main(String[] args) {
		Thread4 t1 = new Thread4();
		t1.start();
		Thread5 t2 = new Thread5();
		t2.start();
//		Thread3 t3 = new Thread3();
//		t3.start();
	}
}
