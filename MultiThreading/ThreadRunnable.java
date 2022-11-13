package MultiThreading;
class MyThread implements Runnable{
	Thread th;
	MyThread()
	{
		th = new Thread(this, "My Child Thread");
		System.out.println("Child Starts Execution !!!");
		System.out.println(th);
		th.start();
	}
	public void run() {
		try {
			for(int i = 0; i<5;i++) {
				System.out.println("Child Thread: " + i);
				th.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Child Thread was Interrupted !!!");
		}
		System.out.println("Child Exiting !!!");
		
	}
}
public class ThreadRunnable {

	public static void main(String[] args) {
		new MyThread();
		try {
			for(int i = 0; i<5;i++) {
				System.out.println("Master Thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Master Thread was Interrupted !!!");
		}
		System.out.println("Master Exiting !!!");

	}

}
