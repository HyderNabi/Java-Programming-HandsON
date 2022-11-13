package javaLabWork;
class MyThreadII implements Runnable{
	Thread thread;
	MyThreadII(String name)
	{
		thread = new Thread(this,name);
		thread.start();
		
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(thread.getName()+" : I AM THREAD");
		}
	}
}
public class Week8_b{

	public static void main(String[] args) {
		new MyThreadII("T1");
		new MyThreadII("T2");
		new MyThreadII("T3");
		
	}

}
