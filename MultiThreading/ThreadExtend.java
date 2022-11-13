package MultiThreading;
class MyThreadII extends Thread{
	MyThreadII()
	{
		super("My Child Thread");
		System.out.println("Child Starts Execution !!!");
		
		start();
	}
	public void run() {
		try {
			for(int i = 0; i<5;i++) {
				System.out.println("Child Thread: " + i);
				sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Child Thread was Interrupted !!!");
		}
		System.out.println("Child Exiting !!!");
		
	}
}
public class ThreadExtend {

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
