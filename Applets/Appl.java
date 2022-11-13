import java.applet.Applet;
import java.awt.Graphics;

public class Appl extends Applet implements Runnable{
	String a;
	Thread t;
	boolean flag;
	public void init()
	{
		a = "This is a Scrolling Banner.";
		
	}
	public void start()
	{
		t = new Thread(this);
		flag = false;
		t.start();
	}
	public void run()
	{
		for(; ;)
		{
			try{
				repaint();
				Thread.sleep(250);
				if(flag)
				{
					break;
				}
			}catch(InterruptedException e){}
		}
	}
	public void paint(Graphics g) {
		char ch;
		ch = a.charAt(0);
		a = a.substring(1,a.length());
		a+=ch;
		g.drawString(a,50,30); 
	}
	public void stop() {
		flag = true;
		t= null;
	}
	
}

/*
 * <applet code = Appl height = 500 width = 600> </applet> 
 */
