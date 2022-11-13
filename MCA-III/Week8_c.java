package javaLabWork;

class SharedData{
	int n;
	int index = 0;
	synchronized void ProduceData(int i){
		while(index == 1)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		
			this.n = i;
			index = 1;
			System.out.println(Thread.currentThread().getName()+" : "+n);
			notify();
	
		
	}
		
	synchronized void ConsumeData() {
		while(index == 0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		int val;
		val = n;
		index = 0;
		System.out.println( Thread.currentThread().getName()+" : " + val);
		notify();
	}
}
class Producer implements Runnable{
	Thread th;
	SharedData sd;
	public Producer(SharedData data,String name){
		th = new Thread(this,name);
		this.sd = data;
		th.start();
	}
	@Override
	public void run() {
		for(int i = 1;i<=10;i++)
			sd.ProduceData(i);		
	}
	
}
class Consumer implements Runnable{
	Thread th;
	SharedData sd;
	public Consumer
	(SharedData data,String name){
		th = new Thread(this,name);
		this.sd = data;
		th.start();
	}
	@Override
	public void run() {
		for(int i = 1;i<=10;i++)
			sd.ConsumeData();
		
	}
	
}
public class Week8_c {

	public static void main(String[] args) {
		SharedData sd = new SharedData();
		new Producer(sd,"Producer");
		new Consumer(sd,"Consumer");
	
	}

}
