package MultiThreading;
class MyThreadV implements Runnable{
	public void run()
	{
		
		try {
			for(int i = 1; i<=3;i++)
			{
				System.out.println(Thread.currentThread().getName() +": "+ i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Thread Interrupted !!!");
		}
	
	}
}
public class isAliveNJoinII {

	public static void main(String[] args) {
		//MyThreadV t = new MyThreadV();
		Thread mainThread = Thread.currentThread();
		Thread th1 = new Thread(new MyThreadV(),"T1");
		Thread th2 = new Thread(new MyThreadV(),"T2");
		Thread th3 = new Thread(new MyThreadV(),"T3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(th1.isAlive());
		System.out.println(th2.isAlive());
		System.out.println(th3.isAlive());
		System.out.println(mainThread.isAlive());
		try {
			th1.join();
			th2.join();
			th3.join();
			System.out.println(mainThread.isAlive());
			
			
		}catch(InterruptedException e){
			System.out.println("Interrupted !!!");
		}
		
		
	}


}
