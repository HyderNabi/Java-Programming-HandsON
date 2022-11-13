package MultiThreading;
class MyThreadIV extends Thread{
	public void run()
	{
		
		try {
			for(int i = 1; i<=3;i++)
			{
				System.out.println(this.getName() +": "+ i);
				sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Thread Interrupted !!!");
		}
	
	}
}
public class isAliveNJoin {

	public static void main(String[] args) {
		//isAlive and Join in Threading
		MyThreadIV th1 = new MyThreadIV();
		MyThreadIV th2 = new MyThreadIV();
		MyThreadIV th3 = new MyThreadIV();
		
		th1.setName("T1");
		th2.setName("T2");
		th3.setName("T3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(th1.isAlive());
		System.out.println(th2.isAlive());
		System.out.println(th3.isAlive());
		
		try {
			//Main Thread will wait till all child threads finish their execution
			//by Calling join from Main Thread.
			th1.join();
			th2.join();
			th3.join();
		}catch(InterruptedException e) {
			System.out.println("thread Interrupted");
		}
		System.out.println(th1.isAlive());
		System.out.println(th2.isAlive());
		System.out.println(th3.isAlive());
		
		System.out.println("The Main Thread is Exiting !!!");


	}


}
