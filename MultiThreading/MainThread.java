package MultiThreading;

public class MainThread {

	public static void main(String[] args) {
		//Getting Reference of The Main Thread
		Thread th = Thread.currentThread();
		th.setName("Master Thread");
		System.out.println(th.getName());
		
		try {
			for(int i = 0;i<5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Main Thread was Interrupted !!!");
		}

	}

}
