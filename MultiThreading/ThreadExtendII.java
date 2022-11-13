package MultiThreading;
class MyThreadIII extends Thread{
	public void run()
	{
		
		try {
			for(int i = 0; i<10;i++)
			{
				System.out.println(this.getName() +": "+ i);
				sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Thread Interrupted !!!");
		}
	
	}
}
public final class ThreadExtendII {

	public static void main(String[] args) {
		//MultiThreading in java
		MyThreadIII th1 = new MyThreadIII();
		MyThreadIII th2 = new MyThreadIII();
		th1.setName("T1");
		th2.setName("T2");
		th1.start();
		th2.start();


	}

}
