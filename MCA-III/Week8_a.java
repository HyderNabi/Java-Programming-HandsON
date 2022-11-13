package javaLabWork;
class MyThread extends Thread{
	MyThread(String name)
	{
		this.setName(name);
		this.start();
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(this.getName()+" : I AM THREAD");
		}
	}
}
public class Week8_a{

	public static void main(String[] args) {
		new MyThread("T1");
		new MyThread("T2");
		new MyThread("T3");
		
	}

}
