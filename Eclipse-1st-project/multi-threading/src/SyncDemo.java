
public class SyncDemo implements Runnable{
	public void run() {
		String name=Thread.currentThread().getName();
		print(name);
	
	}
	private  void print(String name) {
		try {
			System.out.print("{");
			Thread.sleep(1000);
			System.out.print(name);
			Thread.sleep(1000);
			System.out.print("}");
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		SyncDemo sd=new SyncDemo();
		
		Thread t1=new Thread(sd,"Alfa");
		Thread t2=new Thread(sd,"Beta");
		Thread t3=new Thread(sd,"Gama");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}
