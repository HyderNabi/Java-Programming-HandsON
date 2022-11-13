package MultiThreading;
class MyThreadVI implements Runnable{
	Thread t;
	MyThreadVI(String msg,int Pri)
	{
		t = new Thread(this,msg);
		try {
			t.setPriority(Pri);
		}catch(IllegalArgumentException e) {
			System.out.println("Priority Setting Level Should be Within the Range from 1 to 10 ");
		}
		t.start();
	}
	@Override
	public void run() {
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println("Name = " + t.getName() +": Priority = " + t.getPriority() + " : " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Interrupted !!!");
		}
		
	}
	
}
public class ThreadPriorities {

	public static void main(String[] args) {
		MyThreadVI t1 = new MyThreadVI("T1",5);
		MyThreadVI t2 = new MyThreadVI("T2",10);
		MyThreadVI t3 = new MyThreadVI("T3",1);

	}

}
