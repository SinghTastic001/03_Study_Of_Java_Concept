package MultiThreading;

class Resource{
	
	public synchronized void printDetails() {
		
		for(int i=1; i<10; i++) {
			System.out.println("res "+i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyThread1 extends Thread{
	
	Resource resource;
	public MyThread1(Resource resource) {
		this.resource = resource;
	}
	
	public void run() {
		resource.printDetails();
	}
}

class MyThread2 extends Thread{
	
	Resource resource;
	
	public MyThread2(Resource resource) {
		this.resource = resource;
	}
	
	public void run() {
	     resource.printDetails();	
	}
}
public class SynchronizationMethod {

	public static void main(String[] args) {
		
		Resource resource = new Resource();
		MyThread1 t1 = new MyThread1(resource);
		MyThread2  t2 = new MyThread2(resource);
		
		t1.start();
		t2.start();
	}
}
