package MultiThreading;
class CallMeII{
	public void Call(String msg)
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

class mySyncThreadII implements Runnable{
	Thread t;
	String msg;
	CallMeII Ref;
	mySyncThreadII(String msg,CallMeII me)
	{
		t = new Thread(this);
		this.msg = msg;
		Ref = me;
		
		t.start();
	}
	@Override 
	public void run()
	{
		synchronized(Ref) {
			Ref.Call(msg);
		}
	}
}
public class Synchronized_Block {

	public static void main(String[] args) {
		CallMeII Ref = new CallMeII();
		mySyncThreadII t1 = new mySyncThreadII("Hello", Ref);
		mySyncThreadII t2 = new mySyncThreadII("Synchronized", Ref);
		mySyncThreadII t3 = new mySyncThreadII("World", Ref);

	}

}


