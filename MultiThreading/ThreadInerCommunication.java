package MultiThreading;
class Q{
	public int n;
	boolean flag = false;
	public synchronized int get()
	{
		while(!flag) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Interrupted !!!");
			}
		}
		System.out.println(Thread.currentThread().getName()+": "+n);
		flag = false;
		notify();
		return this.n;
		
	}
	public synchronized void put(int i) {
		while(flag) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Interrupted !!!");
			}
		}
		this.n = i;
		System.out.println(Thread.currentThread().getName()+": "+n);
		
		flag = true;
		notify();
	}
}
class Producer implements Runnable{
	Q q;
	Producer(Q q){
		this.q = q;
		new Thread(this,"P").start();
	}
	@Override
	public void run() {
		int i = 1;	
		for(;i<15;){
				q.put(i++);
			}
	}
}
class Consumer implements Runnable{
	Q q;
	Consumer(Q q){
		this.q = q;
		new Thread(this,"C").start();
	}
	@Override
	public void run() {
		
		for(int i = 1;i<15;i++){
				q.get();
			}
	}
}
public class ThreadInerCommunication {

	public static void main(String[] args) {
		
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		Thread.State t = Thread.currentThread().getState();
		System.out.println(t);
	}

}
