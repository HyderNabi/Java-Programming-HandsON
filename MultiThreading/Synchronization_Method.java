package MultiThreading;
class CallMe{
	synchronized void Call(String msg)
	{
	//Synchronized Problem = Print the Every Message(msg) between {}; 
		System.out.print("{" + msg);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println("Interrupted !!!");
		}
		
		System.out.print("}");
	}
}

class mySyncThread implements Runnable{
	Thread t;
	String msg;
	CallMe Ref;
	mySyncThread(String msg,CallMe me)
	{
		t = new Thread(this);
		this.msg = msg;
		Ref = me;
		
		t.start();
	}
	@Override 
	public void run()
	{
		
		Ref.Call(msg);
	}
}
public class Synchronization_Method {

	public static void main(String[] args) {
		CallMe Ref = new CallMe();
		mySyncThread t1 = new mySyncThread("Hello", Ref);
		mySyncThread t2 = new mySyncThread("Synchronized", Ref);
		mySyncThread t3 = new mySyncThread("World", Ref);

	}

}
